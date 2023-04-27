package demo22.org.springframework.extension.support;

import demo22.org.springframework.extension.BeansException;
import demo22.org.springframework.extension.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
