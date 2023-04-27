package demo12.org.springframework.factory.support;

import demo12.org.springframework.BeansException;
import demo12.org.springframework.factory.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
