package demo30.org.springframework.lazy;

import demo30.org.springframework.lazy.config.AutowireCapableBeanFactory;
import demo30.org.springframework.lazy.config.BeanDefinition;
import demo30.org.springframework.lazy.config.BeanPostProcessor;
import demo30.org.springframework.lazy.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void preInstantiateSingletons() throws BeansException;

}
