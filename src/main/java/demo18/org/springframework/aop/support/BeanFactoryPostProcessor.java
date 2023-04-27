package demo18.org.springframework.aop.support;

import demo18.org.springframework.aop.BeansException;
import demo18.org.springframework.aop.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
