package demo23.org.springframework.extension.support;

import demo23.org.springframework.extension.BeansException;
import demo23.org.springframework.extension.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
