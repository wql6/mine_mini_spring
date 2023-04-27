package demo28.org.springframework.circular.config;

import demo28.org.springframework.circular.BeansException;
import demo28.org.springframework.circular.HierarchicalBeanFactory;
import demo28.org.springframework.circular.config.BeanDefinition;
import demo28.org.springframework.circular.config.BeanPostProcessor;
import demo28.org.springframework.circular.config.SingletonBeanRegistry;
import demo28.org.springframework.circular.core.convert.ConversionService;
import demo28.org.springframework.circular.util.StringValueResolver;

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

    void setConversionService(ConversionService conversionService);

    ConversionService getConversionService();

}
