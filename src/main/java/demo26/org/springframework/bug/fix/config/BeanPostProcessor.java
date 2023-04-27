package demo26.org.springframework.bug.fix.config;

import demo26.org.springframework.bug.fix.BeansException;

public interface BeanPostProcessor {


    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
