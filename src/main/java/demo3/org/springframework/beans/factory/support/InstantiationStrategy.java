package demo3.org.springframework.beans.factory.support;

import demo3.org.springframework.beans.factory.BeansException;
import demo3.org.springframework.beans.factory.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
