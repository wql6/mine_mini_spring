package demo29.org.springframework.circular.proxy.support;

import demo29.org.springframework.circular.proxy.BeansException;
import demo29.org.springframework.circular.proxy.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
