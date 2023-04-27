package demo13.org.springframework.factory.bean.factory;

import demo13.org.springframework.factory.bean.Aware;
import demo13.org.springframework.factory.bean.BeanFactory;
import demo13.org.springframework.factory.bean.BeansException;

public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
