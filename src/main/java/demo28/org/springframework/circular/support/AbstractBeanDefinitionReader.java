package demo28.org.springframework.circular.support;

import demo28.org.springframework.circular.BeansException;
import demo28.org.springframework.circular.io.DefaultResourceLoader;
import demo28.org.springframework.circular.io.ResourceLoader;
import demo28.org.springframework.circular.support.BeanDefinitionRegistry;
import demo28.org.springframework.circular.support.BeanDefinitonReader;

public abstract class AbstractBeanDefinitionReader implements BeanDefinitonReader {

    private final demo28.org.springframework.circular.support.BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(demo28.org.springframework.circular.support.BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }


    protected AbstractBeanDefinitionReader(demo28.org.springframework.circular.support.BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
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
