package demo14.org.springframework.event.listener;

import demo14.org.springframework.event.listener.config.AutowireCapableBeanFactory;
import demo14.org.springframework.event.listener.config.BeanDefinition;
import demo14.org.springframework.event.listener.config.BeanPostProcessor;
import demo14.org.springframework.event.listener.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void preInstantiateSingletons() throws BeansException;

}
