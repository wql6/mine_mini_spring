package demo23.org.springframework.extension.config;

import demo23.org.springframework.extension.BeansException;
import demo23.org.springframework.extension.HierarchicalBeanFactory;

/**
 * @author derekyi
 * @date 2020/11/28
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void destroySingletons();
}
