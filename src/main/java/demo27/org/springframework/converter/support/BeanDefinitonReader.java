package demo27.org.springframework.converter.support;

import demo27.org.springframework.converter.BeansException;
import demo27.org.springframework.converter.io.Resource;
import demo27.org.springframework.converter.io.ResourceLoader;

public interface BeanDefinitonReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;


    void loadBeanDefinitions(String location) throws BeansException;


    void loadBeanDefinitions(String[] locations) throws BeansException;



}
