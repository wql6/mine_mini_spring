package demo8.org.springframework.beans;

import demo8.org.springframework.beans.factory.ListableBeanFactory;
import demo8.org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import demo8.org.springframework.beans.factory.config.BeanPostProcessor;
import demo8.org.springframework.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {


    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
