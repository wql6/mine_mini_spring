package demo11.org.springframework;

import demo11.org.springframework.factory.ListableBeanFactory;
import demo11.org.springframework.factory.config.AutowireCapableBeanFactory;
import demo11.org.springframework.factory.config.BeanDefinition;
import demo11.org.springframework.factory.config.BeanPostProcessor;
import demo11.org.springframework.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void preInstantiateSingletons() throws BeansException;

}
