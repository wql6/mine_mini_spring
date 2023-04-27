package demo13.org.springframework.factory.bean.factory.config;

import demo13.org.springframework.factory.bean.BeansException;

public interface BeanPostProcessor {


    Object postProcessorBeforeInitialization(Object bean, String beanName) throws BeansException;

    Object postProcessorAfterInitialization(Object bean, String beanName) throws BeansException;
}
