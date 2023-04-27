package org.springframework.test.ioc.cmmon;

import demo9.org.springframework.beans.BeansException;
import demo9.org.springframework.beans.ConfigurableListableBeanFactory;
import demo9.org.springframework.beans.PropertyValue;
import demo9.org.springframework.beans.PropertyValues;
import demo9.org.springframework.beans.factory.config.BeanDefinition;
import demo9.org.springframework.beans.factory.support.BeanFactoryPostProcessor;

public class CustomeBeanFactoryPostProcessor implements BeanFactoryPostProcessor {


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition personBeanDefinition = beanFactory.getBeanDefinition("person");
        PropertyValues propertyValues = personBeanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name", "ivy"));
    }
}
