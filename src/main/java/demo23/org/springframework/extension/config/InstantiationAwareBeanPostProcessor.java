package demo23.org.springframework.extension.config;

import demo23.org.springframework.extension.BeansException;

public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {

    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;
}
