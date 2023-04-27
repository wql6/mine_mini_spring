package demo3.org.springframework.beans.factory.support;

import demo3.org.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitonRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
