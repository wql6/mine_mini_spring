package demo7.org.springframework.beans.factory.support;

import demo7.org.springframework.beans.BeansException;
import demo7.org.springframework.beans.factory.io.Resource;
import demo7.org.springframework.beans.factory.io.ResourceLoader;

public interface BeanDefinitonReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;


    void loadBeanDefinitions(String location) throws BeansException;


    void loadBeanDefinitions(String[] locations) throws BeansException;



}
