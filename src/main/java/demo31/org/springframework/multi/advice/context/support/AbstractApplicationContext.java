package demo31.org.springframework.multi.advice.context.support;

import demo31.org.springframework.multi.advice.BeansException;
import demo31.org.springframework.multi.advice.ConfigurableListableBeanFactory;
import demo31.org.springframework.multi.advice.config.BeanPostProcessor;
import demo31.org.springframework.multi.advice.context.ApplicationListener;
import demo31.org.springframework.multi.advice.context.ConfigurableApplicationContext;
import demo31.org.springframework.multi.advice.context.event.*;
import demo31.org.springframework.multi.advice.context.support.ApplicationContextAwareProcessor;
import demo31.org.springframework.multi.advice.core.convert.ConversionService;
import demo31.org.springframework.multi.advice.io.DefaultResourceLoader;
import demo31.org.springframework.multi.advice.support.BeanFactoryPostProcessor;

import java.util.Collection;
import java.util.Map;

public abstract class AbstractApplicationContext extends DefaultResourceLoader implements ConfigurableApplicationContext {

    private ApplicationEventMulticaster applicationEventMulticaster;

    public static final String APPLICATION_EVENT_MULTICASTER_BEAN_NAME = "applicationEventMulticaster";

    public static final String CONVERSION_SERVICE_BEAN_NAME = "conversionService";

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

        //注册类型转换器和提前实例化单例bean
        finishBeanFactoryInitialization(beanFactory);

//        beanFactory.preInstantiateSingletons();

        // 容器刷新事件
        finishRefresh();

    }

    protected void finishBeanFactoryInitialization(ConfigurableListableBeanFactory beanFactory) {
        if(beanFactory.containsBean(CONVERSION_SERVICE_BEAN_NAME)){
            Object conversionService = beanFactory.getBean(CONVERSION_SERVICE_BEAN_NAME);
            if(conversionService instanceof ConversionService){
                beanFactory.setConversionService((ConversionService) conversionService);
            }
        }
        beanFactory.preInstantiateSingletons();
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

    @Override
    public <T> T getBean(Class<T> requiredType) throws BeansException {
        return getBeanFactory().getBean(requiredType);
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

    @Override
    public boolean containsBean(String name) {
        return getBeanFactory().containsBean(name);
    }
}
