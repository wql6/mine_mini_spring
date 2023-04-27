package demo24.org.springframework.extension.support;

import demo24.org.springframework.extension.BeansException;
import demo24.org.springframework.extension.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
