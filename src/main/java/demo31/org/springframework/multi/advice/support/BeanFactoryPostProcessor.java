package demo31.org.springframework.multi.advice.support;

import demo31.org.springframework.multi.advice.BeansException;
import demo31.org.springframework.multi.advice.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
