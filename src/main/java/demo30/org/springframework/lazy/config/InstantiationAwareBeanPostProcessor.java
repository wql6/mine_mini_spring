package demo30.org.springframework.lazy.config;

import demo30.org.springframework.lazy.BeansException;
import demo30.org.springframework.lazy.PropertyValues;
import demo30.org.springframework.lazy.config.BeanPostProcessor;

public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {

    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;

    PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName) throws BeansException;


    boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException;

    default Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        return bean;
    }




}
