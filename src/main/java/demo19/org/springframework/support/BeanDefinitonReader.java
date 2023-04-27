package demo19.org.springframework.support;

import demo19.org.springframework.BeansException;
import demo19.org.springframework.io.Resource;
import demo19.org.springframework.io.ResourceLoader;

public interface BeanDefinitonReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;


    void loadBeanDefinitions(String location) throws BeansException;


    void loadBeanDefinitions(String[] locations) throws BeansException;



}
