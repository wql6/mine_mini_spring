package org.springframework.test.ioc;

import demo3.org.springframework.beans.factory.config.BeanDefinition;
import demo3.org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

public class BeanDefinitionAndBeanDefinitionRegistryTest3 {



    @Test
    public void testBeanFactory(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.sayHello();
    }
}
