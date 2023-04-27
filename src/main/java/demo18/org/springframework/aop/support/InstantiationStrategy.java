package demo18.org.springframework.aop.support;

import demo18.org.springframework.aop.BeansException;
import demo18.org.springframework.aop.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
