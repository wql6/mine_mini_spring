package demo29.org.springframework.circular.proxy.support;

import demo29.org.springframework.circular.proxy.BeansException;
import demo29.org.springframework.circular.proxy.config.BeanDefinition;
import demo29.org.springframework.circular.proxy.support.InstantiationStrategy;

import java.lang.reflect.Constructor;

public class SimpleInstantiationStrategy implements InstantiationStrategy {
    
    
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        Class beanClass = beanDefinition.getBeanClass();
        Object bean = null;
        try {
            Constructor constructor = beanClass.getDeclaredConstructor();
            return constructor.newInstance();
        }catch (Exception e){
            throw new BeansException("", e);
        }
    }
}
