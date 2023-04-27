package demo27.org.springframework.converter;

import demo27.org.springframework.converter.config.AutowireCapableBeanFactory;
import demo27.org.springframework.converter.config.BeanDefinition;
import demo27.org.springframework.converter.config.BeanPostProcessor;
import demo27.org.springframework.converter.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void preInstantiateSingletons() throws BeansException;

}
