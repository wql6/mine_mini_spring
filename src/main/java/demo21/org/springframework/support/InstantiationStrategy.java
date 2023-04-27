package demo21.org.springframework.support;

import demo21.org.springframework.BeansException;
import demo21.org.springframework.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
