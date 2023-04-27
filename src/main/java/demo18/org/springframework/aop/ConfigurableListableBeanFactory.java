package demo18.org.springframework.aop;

import demo18.org.springframework.aop.config.AutowireCapableBeanFactory;
import demo18.org.springframework.aop.config.BeanDefinition;
import demo18.org.springframework.aop.config.BeanPostProcessor;
import demo18.org.springframework.aop.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void preInstantiateSingletons() throws BeansException;

}
