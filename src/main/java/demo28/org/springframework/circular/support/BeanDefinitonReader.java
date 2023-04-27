package demo28.org.springframework.circular.support;

import demo28.org.springframework.circular.BeansException;
import demo28.org.springframework.circular.io.Resource;
import demo28.org.springframework.circular.io.ResourceLoader;
import demo28.org.springframework.circular.support.BeanDefinitionRegistry;

public interface BeanDefinitonReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;


    void loadBeanDefinitions(String location) throws BeansException;


    void loadBeanDefinitions(String[] locations) throws BeansException;



}
