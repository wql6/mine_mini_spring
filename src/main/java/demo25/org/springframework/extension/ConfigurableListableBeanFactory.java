package demo25.org.springframework.extension;

import demo25.org.springframework.extension.config.AutowireCapableBeanFactory;
import demo25.org.springframework.extension.config.BeanDefinition;
import demo25.org.springframework.extension.config.BeanPostProcessor;
import demo25.org.springframework.extension.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void preInstantiateSingletons() throws BeansException;

}
