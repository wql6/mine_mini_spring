package demo24.org.springframework.extension.config;

import demo24.org.springframework.extension.BeansException;

public interface BeanPostProcessor {


    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
