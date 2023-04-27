package demo17.org.springframework.aop.support;

import demo17.org.springframework.aop.BeansException;
import demo17.org.springframework.aop.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
