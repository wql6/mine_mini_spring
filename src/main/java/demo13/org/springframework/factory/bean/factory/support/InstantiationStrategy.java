package demo13.org.springframework.factory.bean.factory.support;

import demo13.org.springframework.factory.bean.BeansException;
import demo13.org.springframework.factory.bean.factory.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
