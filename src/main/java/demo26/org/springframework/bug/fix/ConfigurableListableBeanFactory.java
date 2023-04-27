package demo26.org.springframework.bug.fix;

import demo26.org.springframework.bug.fix.config.AutowireCapableBeanFactory;
import demo26.org.springframework.bug.fix.config.BeanDefinition;
import demo26.org.springframework.bug.fix.config.BeanPostProcessor;
import demo26.org.springframework.bug.fix.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void preInstantiateSingletons() throws BeansException;

}
