package demo29.org.springframework.circular.proxy.config;

import demo29.org.springframework.circular.proxy.BeansException;
import demo29.org.springframework.circular.proxy.HierarchicalBeanFactory;
import demo29.org.springframework.circular.proxy.config.BeanDefinition;
import demo29.org.springframework.circular.proxy.config.BeanPostProcessor;
import demo29.org.springframework.circular.proxy.config.SingletonBeanRegistry;
import demo29.org.springframework.circular.proxy.core.convert.ConversionService;
import demo29.org.springframework.circular.proxy.util.StringValueResolver;

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
