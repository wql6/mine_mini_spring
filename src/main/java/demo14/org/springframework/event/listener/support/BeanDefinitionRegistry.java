package demo14.org.springframework.event.listener.support;

import demo14.org.springframework.event.listener.BeansException;
import demo14.org.springframework.event.listener.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    boolean containsBeanDefinition(String beanName);

    String[] getBeanDefinitionNames();
}
