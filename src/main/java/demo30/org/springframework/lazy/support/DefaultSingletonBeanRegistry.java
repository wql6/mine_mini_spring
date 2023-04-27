package demo30.org.springframework.lazy.support;

import demo30.org.springframework.lazy.BeansException;
import demo30.org.springframework.lazy.DisposableBean;
import demo30.org.springframework.lazy.ObjectFactory;
import demo30.org.springframework.lazy.config.SingletonBeanRegistry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    protected Map<String, Object> earlySingletonObjects = new HashMap<>();

    private final Map<String, ObjectFactory<?>> singletonFactories = new HashMap<String, ObjectFactory<?>>();


    protected void addSingletonFactory(String beanName, ObjectFactory<?> singletonFactory) {
        singletonFactories.put(beanName, singletonFactory);
    }



    @Override
    public Object getSingleton(String name) {
        Object singletonObject = singletonObjects.get(name);
        if(singletonObject == null){
            singletonObject = earlySingletonObjects.get(name);
            if(singletonObject == null){
                ObjectFactory<?> singletonFactory = singletonFactories.get(name);
                if(singletonFactory != null){
                    singletonObject = singletonFactory.getObject();

                    // 从二级缓存放进一级缓存
                    earlySingletonObjects.put(name, singletonObject);
                    singletonFactories.remove(name);
                }
            }
        }
        return singletonObject;
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
