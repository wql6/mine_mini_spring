package demo19.org.springframework;

import demo19.org.springframework.config.AutowireCapableBeanFactory;
import demo19.org.springframework.config.BeanDefinition;
import demo19.org.springframework.config.BeanPostProcessor;
import demo19.org.springframework.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void preInstantiateSingletons() throws BeansException;

}
