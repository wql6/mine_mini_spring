package demo12.org.springframework.factory.support;

import demo12.org.springframework.BeansException;
import demo12.org.springframework.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
