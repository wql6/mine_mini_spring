package demo26.org.springframework.bug.fix.config;

import demo26.org.springframework.bug.fix.BeansException;
import demo26.org.springframework.bug.fix.HierarchicalBeanFactory;
import demo26.org.springframework.bug.fix.util.StringValueResolver;

/**
 * @author derekyi
 * @date 2020/11/28
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {


    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void destroySingletons();

    void addEmbeddedValueResolver(StringValueResolver valueResolver);

    String resolveEmbeddedValue(String value);

}
