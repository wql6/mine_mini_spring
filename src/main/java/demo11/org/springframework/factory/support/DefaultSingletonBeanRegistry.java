package demo11.org.springframework.factory.support;

import demo11.org.springframework.BeansException;
import demo11.org.springframework.factory.DisposableBean;
import demo11.org.springframework.factory.config.SingletonBeanRegistry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();


    @Override
    public Object getSingleton(String name) {
        return singletonObjects.get(name);
    }

    protected  void addSingleton(String beanName, Object singletonObject){
        singletonObjects.put(beanName, singletonObject);
    }


    private final Map<String, DisposableBean> disposableBeans = new HashMap<>();

    public void registerDisposableBean(String beanName, DisposableBean bean) {
        disposableBeans.put(beanName, bean);
    }


    public void destroySingletons() {
        ArrayList<String> beanNames = new ArrayList<>(disposableBeans.keySet());
        for (String beanName : beanNames) {
            DisposableBean disposableBean = disposableBeans.remove(beanName);
            try {
                disposableBean.destroy();
            } catch (Exception e) {
                throw new BeansException("Destroy method on bean with name '" + beanName + "' threw an exception", e);
            }
        }
    }


}
