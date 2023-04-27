package demo9.org.springframework.beans;

import demo9.org.springframework.beans.factory.ListableBeanFactory;
import demo9.org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import demo9.org.springframework.beans.factory.config.ConfigurableBeanFactory;
import demo9.org.springframework.beans.factory.config.BeanDefinition;
import demo9.org.springframework.beans.factory.config.BeanPostProcessor;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void preInstantiateSingletons() throws BeansException;

}
