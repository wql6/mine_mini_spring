package demo11.org.springframework.factory.support;

import demo11.org.springframework.BeansException;
import demo11.org.springframework.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
