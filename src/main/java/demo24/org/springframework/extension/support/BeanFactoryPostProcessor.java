package demo24.org.springframework.extension.support;

import demo24.org.springframework.extension.BeansException;
import demo24.org.springframework.extension.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
