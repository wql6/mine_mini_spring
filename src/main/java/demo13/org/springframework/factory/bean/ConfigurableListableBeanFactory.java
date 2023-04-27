package demo13.org.springframework.factory.bean;

import demo13.org.springframework.factory.bean.factory.ListableBeanFactory;
import demo13.org.springframework.factory.bean.factory.config.AutowireCapableBeanFactory;
import demo13.org.springframework.factory.bean.factory.config.BeanDefinition;
import demo13.org.springframework.factory.bean.factory.config.BeanPostProcessor;
import demo13.org.springframework.factory.bean.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void preInstantiateSingletons() throws BeansException;

}
