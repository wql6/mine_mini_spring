package demo23.org.springframework.extension.config;

import demo23.org.springframework.extension.BeansException;

public interface BeanPostProcessor {


    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
