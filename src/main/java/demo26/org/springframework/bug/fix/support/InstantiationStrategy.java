package demo26.org.springframework.bug.fix.support;

import demo26.org.springframework.bug.fix.BeansException;
import demo26.org.springframework.bug.fix.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
