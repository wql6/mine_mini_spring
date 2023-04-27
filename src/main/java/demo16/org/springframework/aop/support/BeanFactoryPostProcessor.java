package demo16.org.springframework.aop.support;

import demo16.org.springframework.aop.BeansException;
import demo16.org.springframework.aop.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
