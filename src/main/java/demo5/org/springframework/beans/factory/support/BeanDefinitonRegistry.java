package demo5.org.springframework.beans.factory.support;

import demo5.org.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitonRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
