package demo21.org.springframework.config;

import demo21.org.springframework.BeansException;

public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor{

    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;
}
