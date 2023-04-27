package demo13.org.springframework.factory.bean.factory.support;

import demo13.org.springframework.factory.bean.BeansException;
import demo13.org.springframework.factory.bean.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    boolean containsBeanDefinition(String beanName);

    String[] getBeanDefinitionNames();
}
