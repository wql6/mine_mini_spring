package demo29.org.springframework.circular.proxy.context.event;

import demo29.org.springframework.circular.proxy.ApplicationEvent;
import demo29.org.springframework.circular.proxy.BeanFactory;
import demo29.org.springframework.circular.proxy.BeanFactoryAware;
import demo29.org.springframework.circular.proxy.BeansException;
import demo29.org.springframework.circular.proxy.context.ApplicationListener;
import demo29.org.springframework.circular.proxy.context.event.ApplicationEventMulticaster;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractApplicationEventMulticaster implements ApplicationEventMulticaster, BeanFactoryAware {

    public final Set<ApplicationListener<ApplicationEvent>> applicationListeners = new HashSet<>();


    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    public void addApplicationListener(ApplicationListener<?> listener) {
        applicationListeners.add((ApplicationListener<ApplicationEvent>) listener);
    }

    @Override
    public void removeApplicationListener(ApplicationListener<?> listener) {
        applicationListeners.remove(listener);
    }

}
