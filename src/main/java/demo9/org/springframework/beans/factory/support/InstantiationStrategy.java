package demo9.org.springframework.beans.factory.support;

import demo9.org.springframework.beans.BeansException;
import demo9.org.springframework.beans.factory.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
