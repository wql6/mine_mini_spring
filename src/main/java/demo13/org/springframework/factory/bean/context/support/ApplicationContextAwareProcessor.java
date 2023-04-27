package demo13.org.springframework.factory.bean.context.support;

import demo13.org.springframework.factory.bean.BeansException;
import demo13.org.springframework.factory.bean.context.ApplicationContext;
import demo13.org.springframework.factory.bean.context.ApplicationContextAware;
import demo13.org.springframework.factory.bean.factory.config.BeanPostProcessor;

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
