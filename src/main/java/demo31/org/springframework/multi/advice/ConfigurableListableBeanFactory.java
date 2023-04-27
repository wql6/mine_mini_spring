package demo31.org.springframework.multi.advice;

import demo31.org.springframework.multi.advice.config.AutowireCapableBeanFactory;
import demo31.org.springframework.multi.advice.config.BeanDefinition;
import demo31.org.springframework.multi.advice.config.BeanPostProcessor;
import demo31.org.springframework.multi.advice.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void preInstantiateSingletons() throws BeansException;

}
