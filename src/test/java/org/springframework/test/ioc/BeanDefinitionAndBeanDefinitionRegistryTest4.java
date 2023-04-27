package org.springframework.test.ioc;

import demo4.org.springframework.beans.factory.PropertyValue;
import demo4.org.springframework.beans.factory.PropertyValues;
import demo4.org.springframework.beans.factory.config.BeanDefinition;
import demo4.org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;
import org.springframework.test.ioc.bean.Person;

public class BeanDefinitionAndBeanDefinitionRegistryTest4 {



    @Test
    public void testBeanFactory(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name", "derek"));
        propertyValues.addPropertyValue(new PropertyValue("age", 18));

        BeanDefinition beanDefinition = new BeanDefinition(Person.class, propertyValues);
        beanFactory.registerBeanDefinition("person", beanDefinition);

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
    }
}
