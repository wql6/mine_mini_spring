package demo16.org.springframework.aop.config;

import demo16.org.springframework.aop.BeansException;

public interface BeanPostProcessor {


    Object postProcessorBeforeInitialization(Object bean, String beanName) throws BeansException;

    Object postProcessorAfterInitialization(Object bean, String beanName) throws BeansException;
}
