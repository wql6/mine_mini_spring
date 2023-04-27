package demo10.org.springframework.factory.support;

import demo10.org.springframework.BeansException;
import demo10.org.springframework.factory.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
