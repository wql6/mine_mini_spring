package demo21.org.springframework;

import demo21.org.springframework.config.AutowireCapableBeanFactory;
import demo21.org.springframework.config.BeanDefinition;
import demo21.org.springframework.config.BeanPostProcessor;
import demo21.org.springframework.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void preInstantiateSingletons() throws BeansException;

}
