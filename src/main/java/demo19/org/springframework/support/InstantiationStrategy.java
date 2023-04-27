package demo19.org.springframework.support;

import demo19.org.springframework.BeansException;
import demo19.org.springframework.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
