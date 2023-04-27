package demo8.org.springframework.beans.factory.support;

import demo8.org.springframework.beans.BeansException;
import demo8.org.springframework.beans.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
