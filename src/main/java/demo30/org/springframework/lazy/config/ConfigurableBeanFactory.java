package demo30.org.springframework.lazy.config;

import demo30.org.springframework.lazy.BeansException;
import demo30.org.springframework.lazy.HierarchicalBeanFactory;
import demo30.org.springframework.lazy.config.BeanDefinition;
import demo30.org.springframework.lazy.config.BeanPostProcessor;
import demo30.org.springframework.lazy.config.SingletonBeanRegistry;
import demo30.org.springframework.lazy.core.convert.ConversionService;
import demo30.org.springframework.lazy.util.StringValueResolver;

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
