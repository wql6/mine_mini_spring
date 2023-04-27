package demo26.org.springframework.bug.fix.support;

import demo26.org.springframework.bug.fix.BeansException;
import demo26.org.springframework.bug.fix.ConfigurableListableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
