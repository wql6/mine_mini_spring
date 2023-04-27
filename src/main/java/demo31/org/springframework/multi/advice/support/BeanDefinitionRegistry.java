package demo31.org.springframework.multi.advice.support;

import demo31.org.springframework.multi.advice.BeansException;
import demo31.org.springframework.multi.advice.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    boolean containsBeanDefinition(String beanName);

    String[] getBeanDefinitionNames();
}
