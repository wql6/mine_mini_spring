package demo21.org.springframework.support;

import demo21.org.springframework.BeansException;
import demo21.org.springframework.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
