package org.springframework.test.ioc;

import demo8.org.springframework.beans.factory.support.DefaultListableBeanFactory;
import demo8.org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.junit.Test;
import org.springframework.test.ioc.bean.Car;
import org.springframework.test.ioc.bean.Person;
import org.springframework.test.ioc.cmmon.CustomeBeanFactoryPostProcessor;
import org.springframework.test.ioc.cmmon.CustomerBeanPostProcessor;

import static org.assertj.core.api.Assertions.assertThat;

public class Demo8_BeanFactoryPostProcessorAndBeanPostProcessor {


    @Test
    public void testBeanFactoryPostProcessor(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        /*CustomeBeanFactoryPostProcessor customeBeanFactoryPostProcessor = new CustomeBeanFactoryPostProcessor();
        customeBeanFactoryPostProcessor.postProcessBeanFactory(beanFactory);*/

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
        assertThat(person.getName()).isEqualTo("ivy");
        assertThat(person.getCar().getBrand()).isEqualTo("porsche");

        Car car = (Car) beanFactory.getBean("car");
        System.out.println(car);
        assertThat(car.getBrand()).isEqualTo("porsche");


    }

    @Test
    public void testBeanPostProcessor(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        /*CustomerBeanPostProcessor customeBeanPostProcessor = new CustomerBeanPostProcessor();
        beanFactory.addBeanPostProcessor(customeBeanPostProcessor);*/


        Car car = (Car) beanFactory.getBean("car");
        System.out.println(car);
        assertThat(car.getBrand()).isEqualTo("lamborghini");


    }
}
