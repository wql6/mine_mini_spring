package demo15.org.springframework.aop.support;

import demo15.org.springframework.aop.BeansException;
import demo15.org.springframework.aop.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
