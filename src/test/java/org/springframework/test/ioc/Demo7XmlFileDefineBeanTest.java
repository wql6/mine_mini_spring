package org.springframework.test.ioc;

import demo7.org.springframework.beans.factory.support.DefaultListableBeanFactory;
import demo7.org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.junit.Test;
import org.springframework.test.ioc.bean.Car;
import org.springframework.test.ioc.bean.Person;

import static org.assertj.core.api.Assertions.assertThat;

public class Demo7XmlFileDefineBeanTest {


    @Test
    public void testXmlFile(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");


        System.out.println(beanFactory.getBeanDefinitionMap());

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
        assertThat(person.getName()).isEqualTo("derek");
        assertThat(person.getCar().getBrand()).isEqualTo("porsche");

        Car car = (Car) beanFactory.getBean("car");
        System.out.println(car);
        assertThat(car.getBrand()).isEqualTo("porsche");


    }
}
