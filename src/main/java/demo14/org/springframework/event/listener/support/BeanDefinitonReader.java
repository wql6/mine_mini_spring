package demo14.org.springframework.event.listener.support;

import demo14.org.springframework.event.listener.BeansException;
import demo14.org.springframework.event.listener.io.Resource;
import demo14.org.springframework.event.listener.io.ResourceLoader;

public interface BeanDefinitonReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;


    void loadBeanDefinitions(String location) throws BeansException;


    void loadBeanDefinitions(String[] locations) throws BeansException;



}
