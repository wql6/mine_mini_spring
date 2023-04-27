package demo10.org.springframework.factory.support;

import demo10.org.springframework.BeansException;
import demo10.org.springframework.factory.io.Resource;
import demo10.org.springframework.factory.io.ResourceLoader;

public interface BeanDefinitonReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;


    void loadBeanDefinitions(String location) throws BeansException;


    void loadBeanDefinitions(String[] locations) throws BeansException;



}
