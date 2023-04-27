package demo9.org.springframework.beans.factory.support;

import demo9.org.springframework.beans.BeansException;
import demo9.org.springframework.beans.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
