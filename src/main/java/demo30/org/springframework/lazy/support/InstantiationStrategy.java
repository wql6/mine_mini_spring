package demo30.org.springframework.lazy.support;

import demo30.org.springframework.lazy.BeansException;
import demo30.org.springframework.lazy.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
