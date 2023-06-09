package demo5.org.springframework.beans.factory.support;

import demo5.org.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();


    @Override
    public Object getSingleton(String name) {
        return singletonObjects.get(name);
    }

    protected  void addSingleton(String beanName, Object singletonObject){
        singletonObjects.put(beanName, singletonObjects);
    }
}
