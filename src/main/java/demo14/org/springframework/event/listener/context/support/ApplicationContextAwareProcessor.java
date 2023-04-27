package demo14.org.springframework.event.listener.context.support;

import demo14.org.springframework.event.listener.BeansException;
import demo14.org.springframework.event.listener.config.BeanPostProcessor;
import demo14.org.springframework.event.listener.context.ApplicationContext;
import demo14.org.springframework.event.listener.context.ApplicationContextAware;

public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext){
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessorBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessorAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
