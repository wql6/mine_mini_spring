package demo31.org.springframework.multi.advice.support;

import demo31.org.springframework.multi.advice.BeansException;
import demo31.org.springframework.multi.advice.io.Resource;
import demo31.org.springframework.multi.advice.io.ResourceLoader;
import demo31.org.springframework.multi.advice.support.BeanDefinitionRegistry;

public interface BeanDefinitonReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;


    void loadBeanDefinitions(String location) throws BeansException;


    void loadBeanDefinitions(String[] locations) throws BeansException;



}
