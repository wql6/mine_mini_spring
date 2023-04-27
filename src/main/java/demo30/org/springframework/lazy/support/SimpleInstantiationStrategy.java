package demo30.org.springframework.lazy.support;

import demo30.org.springframework.lazy.BeansException;
import demo30.org.springframework.lazy.config.BeanDefinition;
import demo30.org.springframework.lazy.support.InstantiationStrategy;

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
