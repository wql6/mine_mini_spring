package demo29.org.springframework.circular.proxy.config;

import demo29.org.springframework.circular.proxy.BeansException;
import demo29.org.springframework.circular.proxy.PropertyValues;
import demo29.org.springframework.circular.proxy.config.BeanPostProcessor;

public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {

    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;

    PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName) throws BeansException;


    boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException;

    default Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
        return bean;
    }




}
