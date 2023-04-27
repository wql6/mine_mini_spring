package demo28.org.springframework.circular.support;

import demo28.org.springframework.circular.BeansException;
import demo28.org.springframework.circular.config.BeanDefinition;
import demo28.org.springframework.circular.support.InstantiationStrategy;

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
