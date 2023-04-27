package demo5.org.springframework.beans.factory.support;

import demo5.org.springframework.beans.factory.BeansException;
import demo5.org.springframework.beans.factory.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
