package demo19.org.springframework.support;

import demo19.org.springframework.BeansException;
import demo19.org.springframework.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
