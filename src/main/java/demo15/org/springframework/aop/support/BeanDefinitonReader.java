package demo15.org.springframework.aop.support;

import demo15.org.springframework.aop.BeansException;
import demo15.org.springframework.aop.io.Resource;
import demo15.org.springframework.aop.io.ResourceLoader;

public interface BeanDefinitonReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;


    void loadBeanDefinitions(String location) throws BeansException;


    void loadBeanDefinitions(String[] locations) throws BeansException;



}
