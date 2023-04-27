package demo7.org.springframework.beans.factory.support;

import demo7.org.springframework.beans.BeansException;
import demo7.org.springframework.beans.factory.io.DefaultResourceLoader;
import demo7.org.springframework.beans.factory.io.Resource;
import demo7.org.springframework.beans.factory.io.ResourceLoader;

public abstract class AbstractBeanDefinitionReader implements BeanDefinitonReader{

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
