package demo30.org.springframework.lazy.context.event;

import demo30.org.springframework.lazy.ApplicationEvent;
import demo30.org.springframework.lazy.BeanFactory;
import demo30.org.springframework.lazy.BeanFactoryAware;
import demo30.org.springframework.lazy.BeansException;
import demo30.org.springframework.lazy.context.ApplicationListener;
import demo30.org.springframework.lazy.context.event.ApplicationEventMulticaster;

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
