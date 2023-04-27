package demo7.org.springframework.beans.factory.support;

import demo7.org.springframework.beans.factory.config.BeanDefinition;
import demo7.org.springframework.beans.BeansException;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    boolean containsBeanDefinition(String beanName);

    String[] getBeanDefinitionNames();
}
