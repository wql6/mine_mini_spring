package demo29.org.springframework.circular.proxy;

import demo29.org.springframework.circular.proxy.config.AutowireCapableBeanFactory;
import demo29.org.springframework.circular.proxy.config.BeanDefinition;
import demo29.org.springframework.circular.proxy.config.BeanPostProcessor;
import demo29.org.springframework.circular.proxy.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void preInstantiateSingletons() throws BeansException;

}
