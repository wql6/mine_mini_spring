package demo27.org.springframework.converter.support;

import demo27.org.springframework.converter.BeansException;
import demo27.org.springframework.converter.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
