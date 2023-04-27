package demo27.org.springframework.converter.config;

import demo27.org.springframework.converter.BeansException;
import demo27.org.springframework.converter.HierarchicalBeanFactory;
import demo27.org.springframework.converter.core.convert.ConversionService;
import demo27.org.springframework.converter.util.StringValueResolver;

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
