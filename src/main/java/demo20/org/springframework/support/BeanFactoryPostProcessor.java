package demo20.org.springframework.support;

import demo20.org.springframework.BeansException;
import demo20.org.springframework.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
