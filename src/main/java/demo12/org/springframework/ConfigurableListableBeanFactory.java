package demo12.org.springframework;

import demo12.org.springframework.factory.ListableBeanFactory;
import demo12.org.springframework.factory.config.AutowireCapableBeanFactory;
import demo12.org.springframework.factory.config.BeanDefinition;
import demo12.org.springframework.factory.config.BeanPostProcessor;
import demo12.org.springframework.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void preInstantiateSingletons() throws BeansException;

}
