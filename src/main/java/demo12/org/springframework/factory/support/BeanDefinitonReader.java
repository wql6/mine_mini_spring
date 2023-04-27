package demo12.org.springframework.factory.support;

import demo12.org.springframework.BeansException;
import demo12.org.springframework.factory.io.Resource;
import demo12.org.springframework.factory.io.ResourceLoader;

public interface BeanDefinitonReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;


    void loadBeanDefinitions(String location) throws BeansException;


    void loadBeanDefinitions(String[] locations) throws BeansException;



}
