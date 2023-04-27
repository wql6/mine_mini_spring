package demo31.org.springframework.multi.advice.support;

import demo31.org.springframework.multi.advice.BeansException;
import demo31.org.springframework.multi.advice.config.BeanDefinition;
import demo31.org.springframework.multi.advice.support.InstantiationStrategy;

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
