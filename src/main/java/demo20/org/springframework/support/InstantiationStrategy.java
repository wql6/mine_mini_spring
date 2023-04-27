package demo20.org.springframework.support;

import demo20.org.springframework.BeansException;
import demo20.org.springframework.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
