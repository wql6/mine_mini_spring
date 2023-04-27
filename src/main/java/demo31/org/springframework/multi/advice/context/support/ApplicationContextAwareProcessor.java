package demo31.org.springframework.multi.advice.context.support;

import demo31.org.springframework.multi.advice.BeansException;
import demo31.org.springframework.multi.advice.config.BeanPostProcessor;
import demo31.org.springframework.multi.advice.context.ApplicationContext;
import demo31.org.springframework.multi.advice.context.ApplicationContextAware;

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
