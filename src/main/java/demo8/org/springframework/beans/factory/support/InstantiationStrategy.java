package demo8.org.springframework.beans.factory.support;

import demo8.org.springframework.beans.BeansException;
import demo8.org.springframework.beans.factory.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
