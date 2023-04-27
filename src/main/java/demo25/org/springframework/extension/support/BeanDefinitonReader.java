package demo25.org.springframework.extension.support;

import demo25.org.springframework.extension.BeansException;
import demo25.org.springframework.extension.io.Resource;
import demo25.org.springframework.extension.io.ResourceLoader;

public interface BeanDefinitonReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;


    void loadBeanDefinitions(String location) throws BeansException;


    void loadBeanDefinitions(String[] locations) throws BeansException;



}
