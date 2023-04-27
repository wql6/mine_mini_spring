package demo9.org.springframework.beans.factory.config;

import demo9.org.springframework.beans.factory.HierarchicalBeanFactory;
import demo9.org.springframework.beans.BeansException;

/**
 * @author derekyi
 * @date 2020/11/28
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
