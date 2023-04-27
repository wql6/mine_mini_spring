package demo19.org.springframework.config;

import demo19.org.springframework.BeansException;

public interface BeanPostProcessor {


    Object postProcessorBeforeInitialization(Object bean, String beanName) throws BeansException;

    Object postProcessorAfterInitialization(Object bean, String beanName) throws BeansException;
}
