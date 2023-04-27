package demo25.org.springframework.extension.support;

import demo25.org.springframework.extension.BeansException;
import demo25.org.springframework.extension.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
