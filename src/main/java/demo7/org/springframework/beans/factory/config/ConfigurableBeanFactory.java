package demo7.org.springframework.beans.factory.config;

import demo7.org.springframework.beans.BeansException;
import demo7.org.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @author derekyi
 * @date 2020/11/28
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
