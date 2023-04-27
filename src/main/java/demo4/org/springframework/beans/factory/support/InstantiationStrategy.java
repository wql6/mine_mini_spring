package demo4.org.springframework.beans.factory.support;

import demo4.org.springframework.beans.factory.BeansException;
import demo4.org.springframework.beans.factory.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
