package demo29.org.springframework.circular.proxy.context.support;

import demo29.org.springframework.circular.proxy.BeansException;
import demo29.org.springframework.circular.proxy.config.BeanPostProcessor;
import demo29.org.springframework.circular.proxy.context.ApplicationContext;
import demo29.org.springframework.circular.proxy.context.ApplicationContextAware;

public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext){
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
