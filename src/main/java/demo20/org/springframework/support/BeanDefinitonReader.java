package demo20.org.springframework.support;

import demo20.org.springframework.BeansException;
import demo20.org.springframework.io.Resource;
import demo20.org.springframework.io.ResourceLoader;

public interface BeanDefinitonReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;


    void loadBeanDefinitions(String location) throws BeansException;


    void loadBeanDefinitions(String[] locations) throws BeansException;



}
