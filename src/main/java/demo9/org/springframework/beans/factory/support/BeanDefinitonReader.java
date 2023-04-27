package demo9.org.springframework.beans.factory.support;

import demo9.org.springframework.beans.factory.io.Resource;
import demo9.org.springframework.beans.factory.io.ResourceLoader;
import demo9.org.springframework.beans.BeansException;

public interface BeanDefinitonReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;


    void loadBeanDefinitions(String location) throws BeansException;


    void loadBeanDefinitions(String[] locations) throws BeansException;



}
