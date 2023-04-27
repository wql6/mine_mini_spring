package demo11.org.springframework.factory.config;

import demo11.org.springframework.BeansException;

public interface BeanPostProcessor {


    Object postProcessorBeforeInitialization(Object bean, String beanName) throws BeansException;

    Object postProcessorAfterInitialization(Object bean, String beanName) throws BeansException;
}
