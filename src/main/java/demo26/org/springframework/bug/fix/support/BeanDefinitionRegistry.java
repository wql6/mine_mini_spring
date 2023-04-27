package demo26.org.springframework.bug.fix.support;

import demo26.org.springframework.bug.fix.BeansException;
import demo26.org.springframework.bug.fix.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    boolean containsBeanDefinition(String beanName);

    String[] getBeanDefinitionNames();
}
