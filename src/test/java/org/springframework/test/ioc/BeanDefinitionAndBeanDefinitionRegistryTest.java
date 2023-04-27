package org.springframework.test.ioc;

import demo2.org.springframework.beans.factory.config.BeanDefinition;
import demo2.org.springframework.beans.factory.support.DefaultListableBeanFactory;
import demo2.org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;

public class BeanDefinitionAndBeanDefinitionRegistryTest {



    public void testBeanFactory(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.sayHello();
    }
}
