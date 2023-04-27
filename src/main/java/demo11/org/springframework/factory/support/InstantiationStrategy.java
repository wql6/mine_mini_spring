package demo11.org.springframework.factory.support;

import demo11.org.springframework.BeansException;
import demo11.org.springframework.factory.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
