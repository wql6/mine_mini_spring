package demo31.org.springframework.multi.advice.config;

import demo31.org.springframework.multi.advice.BeansException;

public interface BeanPostProcessor {


    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
