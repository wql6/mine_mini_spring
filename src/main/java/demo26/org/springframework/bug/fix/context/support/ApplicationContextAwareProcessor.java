package demo26.org.springframework.bug.fix.context.support;

import demo26.org.springframework.bug.fix.BeansException;
import demo26.org.springframework.bug.fix.config.BeanPostProcessor;
import demo26.org.springframework.bug.fix.context.ApplicationContext;
import demo26.org.springframework.bug.fix.context.ApplicationContextAware;

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
