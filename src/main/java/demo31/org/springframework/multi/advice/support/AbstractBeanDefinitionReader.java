package demo31.org.springframework.multi.advice.support;

import demo31.org.springframework.multi.advice.BeansException;
import demo31.org.springframework.multi.advice.io.DefaultResourceLoader;
import demo31.org.springframework.multi.advice.io.ResourceLoader;
import demo31.org.springframework.multi.advice.support.BeanDefinitionRegistry;
import demo31.org.springframework.multi.advice.support.BeanDefinitonReader;

public abstract class AbstractBeanDefinitionReader implements BeanDefinitonReader {

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }


    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String[] locations) throws BeansException {
        for (String location : locations) {
            loadBeanDefinitions(location);
        }
    }


    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }




}