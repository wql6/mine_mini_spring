package demo26.org.springframework.bug.fix.support;

import demo26.org.springframework.bug.fix.BeansException;
import demo26.org.springframework.bug.fix.io.Resource;
import demo26.org.springframework.bug.fix.io.ResourceLoader;

public interface BeanDefinitonReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;


    void loadBeanDefinitions(String location) throws BeansException;


    void loadBeanDefinitions(String[] locations) throws BeansException;



}
