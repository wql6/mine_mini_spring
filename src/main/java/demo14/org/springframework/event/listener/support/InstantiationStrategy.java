package demo14.org.springframework.event.listener.support;

import demo14.org.springframework.event.listener.BeansException;
import demo14.org.springframework.event.listener.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
