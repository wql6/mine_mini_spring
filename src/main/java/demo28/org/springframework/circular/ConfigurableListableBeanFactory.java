package demo28.org.springframework.circular;

import demo28.org.springframework.circular.config.AutowireCapableBeanFactory;
import demo28.org.springframework.circular.config.BeanDefinition;
import demo28.org.springframework.circular.config.BeanPostProcessor;
import demo28.org.springframework.circular.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void preInstantiateSingletons() throws BeansException;

}
