package demo26.org.springframework.bug.fix.config;

import demo26.org.springframework.bug.fix.BeansException;
import demo26.org.springframework.bug.fix.PropertyValues;

public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {

    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;

    PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName)
            throws BeansException;
}
