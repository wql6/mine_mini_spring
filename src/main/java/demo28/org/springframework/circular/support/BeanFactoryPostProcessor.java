package demo28.org.springframework.circular.support;

import demo28.org.springframework.circular.BeansException;
import demo28.org.springframework.circular.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
