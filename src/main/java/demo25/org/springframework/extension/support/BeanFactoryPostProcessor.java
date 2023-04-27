package demo25.org.springframework.extension.support;

import demo25.org.springframework.extension.BeansException;
import demo25.org.springframework.extension.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
