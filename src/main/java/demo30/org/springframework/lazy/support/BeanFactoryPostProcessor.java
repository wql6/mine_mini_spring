package demo30.org.springframework.lazy.support;

import demo30.org.springframework.lazy.BeansException;
import demo30.org.springframework.lazy.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
