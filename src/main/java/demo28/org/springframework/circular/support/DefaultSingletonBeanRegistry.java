package demo28.org.springframework.circular.support;

import demo28.org.springframework.circular.BeansException;
import demo28.org.springframework.circular.DisposableBean;
import demo28.org.springframework.circular.config.SingletonBeanRegistry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    protected Map<String, Object> earlySingletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String name) {
        Object bean = singletonObjects.get(name);
        if(bean == null){
            bean = earlySingletonObjects.get(name);
        }
        return bean;
    }

    public  void addSingleton(String beanName, Object singletonObject){
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
