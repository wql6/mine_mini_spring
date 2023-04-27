package demo12.org.springframework.factory;

import demo12.org.springframework.Aware;
import demo12.org.springframework.BeanFactory;
import demo12.org.springframework.BeansException;

public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
