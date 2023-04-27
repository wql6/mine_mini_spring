package demo22.org.springframework.extension.support;

import demo22.org.springframework.extension.BeansException;
import demo22.org.springframework.extension.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
