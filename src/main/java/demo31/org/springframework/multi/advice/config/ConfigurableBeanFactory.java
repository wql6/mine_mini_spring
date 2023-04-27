package demo31.org.springframework.multi.advice.config;

import demo31.org.springframework.multi.advice.BeansException;
import demo31.org.springframework.multi.advice.HierarchicalBeanFactory;
import demo31.org.springframework.multi.advice.config.BeanDefinition;
import demo31.org.springframework.multi.advice.config.BeanPostProcessor;
import demo31.org.springframework.multi.advice.config.SingletonBeanRegistry;
import demo31.org.springframework.multi.advice.core.convert.ConversionService;
import demo31.org.springframework.multi.advice.util.StringValueResolver;

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
