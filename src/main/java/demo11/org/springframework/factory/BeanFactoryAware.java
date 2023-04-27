package demo11.org.springframework.factory;

import demo11.org.springframework.Aware;
import demo11.org.springframework.BeanFactory;
import demo11.org.springframework.BeansException;

public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
