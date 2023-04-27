package org.springframework.test.ioc.service;

import demo11.org.springframework.BeanFactory;
import demo11.org.springframework.BeansException;
import demo11.org.springframework.context.ApplicationContext;
import demo11.org.springframework.context.ApplicationContextAware;
import demo11.org.springframework.factory.BeanFactoryAware;

public class HelloService implements ApplicationContextAware, BeanFactoryAware {


    private ApplicationContext applicationContext;

    private BeanFactory beanFactory;


    public String sayHello() {
        System.out.println("hello");
        return "hello";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }
}
