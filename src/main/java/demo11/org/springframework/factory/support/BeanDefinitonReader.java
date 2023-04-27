package demo11.org.springframework.factory.support;

import demo11.org.springframework.BeansException;
import demo11.org.springframework.factory.io.Resource;
import demo11.org.springframework.factory.io.ResourceLoader;

public interface BeanDefinitonReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;


    void loadBeanDefinitions(String location) throws BeansException;


    void loadBeanDefinitions(String[] locations) throws BeansException;



}
