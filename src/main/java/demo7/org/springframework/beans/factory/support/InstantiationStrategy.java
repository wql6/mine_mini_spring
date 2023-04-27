package demo7.org.springframework.beans.factory.support;

import demo7.org.springframework.beans.BeansException;
import demo7.org.springframework.beans.factory.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
