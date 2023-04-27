package demo29.org.springframework.circular.proxy.support;

import demo29.org.springframework.circular.proxy.BeansException;
import demo29.org.springframework.circular.proxy.io.Resource;
import demo29.org.springframework.circular.proxy.io.ResourceLoader;
import demo29.org.springframework.circular.proxy.support.BeanDefinitionRegistry;

public interface BeanDefinitonReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;


    void loadBeanDefinitions(String location) throws BeansException;


    void loadBeanDefinitions(String[] locations) throws BeansException;



}
