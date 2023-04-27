package demo10.org.springframework.factory.support;

import demo10.org.springframework.BeansException;
import demo10.org.springframework.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
