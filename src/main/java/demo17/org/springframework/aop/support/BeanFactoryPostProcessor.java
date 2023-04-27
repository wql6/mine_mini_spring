package demo17.org.springframework.aop.support;

import demo17.org.springframework.aop.BeansException;
import demo17.org.springframework.aop.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
