package demo23.org.springframework.extension.support;

import demo23.org.springframework.extension.BeansException;
import demo23.org.springframework.extension.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
