package demo16.org.springframework.aop.support;

import demo16.org.springframework.aop.BeansException;
import demo16.org.springframework.aop.io.Resource;
import demo16.org.springframework.aop.io.ResourceLoader;

public interface BeanDefinitonReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;


    void loadBeanDefinitions(String location) throws BeansException;


    void loadBeanDefinitions(String[] locations) throws BeansException;



}
