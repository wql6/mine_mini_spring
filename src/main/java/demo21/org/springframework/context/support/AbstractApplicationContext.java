package demo21.org.springframework.context.support;

import demo21.org.springframework.BeansException;
import demo21.org.springframework.ConfigurableListableBeanFactory;
import demo21.org.springframework.config.BeanPostProcessor;
import demo21.org.springframework.context.ApplicationListener;
import demo21.org.springframework.context.ConfigurableApplicationContext;
import demo21.org.springframework.context.event.*;
import demo21.org.springframework.io.DefaultResourceLoader;
import demo21.org.springframework.support.BeanFactoryPostProcessor;

import java.util.Collection;
import java.util.Map;

public abstract class AbstractApplicationContext extends DefaultResourceLoader implements ConfigurableApplicationContext {

    private ApplicationEventMulticaster applicationEventMulticaster;

    public static final String APPLICATION_EVENT_MULTICASTER_BEAN_NAME = "applicationEventMulticaster";

    @Override
    public void refresh() throws BeansException {
        refreshBeanFactory();
        ConfigurableListableBeanFactory beanFactory = getBeanFactory();

        beanFactory.addBeanPostProcessor(new ApplicationContextAwareProcessor(this));

        // 初始化并执行 改变BeanDefinition的 BeanFactoryPostProcessors方法
        invokeBeanFactoryPostProcessors(beanFactory);

        // 初始化并添加到集合 改变Bean的 BeanPostProcessors对象
        registerBeanPostProcessors(beanFactory);


        initApplicationEventMulticaster();

        //注册事件监听器
        registerListeners();

        beanFactory.preInstantiateSingletons();

        // 容器刷新事件
        finishRefresh();

    }

    protected void finishRefresh() {
        // 此只会执行ContextRefreshedEvent的事件
        publishEvent(new ContextRefreshedEvent(this));
    }

    public void publishEvent(ApplicationContextEvent event) {
        applicationEventMulticaster.multicastEvent(event);
    }

    protected void registerListeners() {
        Collection<ApplicationListener> applicationListeners = getBeansOfType(ApplicationListener.class).values();
        for (ApplicationListener applicationListener : applicationListeners) {
            applicationEventMulticaster.addApplicationListener(applicationListener);
        }
    }

    protected void initApplicationEventMulticaster() {
        ConfigurableListableBeanFactory beanFactory = getBeanFactory();
        applicationEventMulticaster = new SimpleApplicationEventMulticaster(beanFactory);
        beanFactory.addSingleton(APPLICATION_EVENT_MULTICASTER_BEAN_NAME, applicationEventMulticaster);

    }

    protected void registerBeanPostProcessors(ConfigurableListableBeanFactory beanFactory) {
        Map<String, BeanPostProcessor> beanPostProcessorMap = beanFactory.getBeansOfType(BeanPostProcessor.class);
        for (BeanPostProcessor beanPostProcessor : beanPostProcessorMap.values()) {
            beanFactory.addBeanPostProcessor(beanPostProcessor);
        }
    }

    protected void invokeBeanFactoryPostProcessors(ConfigurableListableBeanFactory beanFactory) {
        Map<String, BeanFactoryPostProcessor> beanFactoryPostProcessorMap = beanFactory.getBeansOfType(BeanFactoryPostProcessor.class);
        for (BeanFactoryPostProcessor beanFactoryPostProcessor : beanFactoryPostProcessorMap.values()) {
            beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
        }
    }


    protected abstract void refreshBeanFactory() throws BeansException;


    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return getBeanFactory().getBean(name, requiredType);
    }

    @Override
    public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {
        return getBeanFactory().getBeansOfType(type);
    }

    public Object getBean(String name) throws BeansException {
        return getBeanFactory().getBean(name);
    }

    public String[] getBeanDefinitionNames() {
        return getBeanFactory().getBeanDefinitionNames();
    }

    public abstract ConfigurableListableBeanFactory getBeanFactory();

    public void close(){
        doClose();
    }

    protected void doClose() {
        // 此会执行ClosedEvent事件
        publishEvent(new ContextClosedEvent(this));

        destroyBeans();
    }

    protected void destroyBeans() {
        getBeanFactory().destroySingletons();
    }

    public void registerShutdownHook() {
        Thread shutdownHook = new Thread() {
            public void run() {
                doClose();
            }
        };
        Runtime.getRuntime().addShutdownHook(shutdownHook);

    }
}
