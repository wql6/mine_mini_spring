package demo23.org.springframework.extension.support;

import demo23.org.springframework.extension.BeansException;
import demo23.org.springframework.extension.io.Resource;
import demo23.org.springframework.extension.io.ResourceLoader;

public interface BeanDefinitonReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;


    void loadBeanDefinitions(String location) throws BeansException;


    void loadBeanDefinitions(String[] locations) throws BeansException;



}
