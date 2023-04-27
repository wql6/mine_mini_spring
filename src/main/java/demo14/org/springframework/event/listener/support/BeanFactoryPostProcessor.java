package demo14.org.springframework.event.listener.support;

import demo14.org.springframework.event.listener.BeansException;
import demo14.org.springframework.event.listener.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
