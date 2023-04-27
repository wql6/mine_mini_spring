package demo14.org.springframework.event.listener.context.event;

import demo14.org.springframework.event.listener.ApplicationEvent;
import demo14.org.springframework.event.listener.BeanFactory;
import demo14.org.springframework.event.listener.BeanFactoryAware;
import demo14.org.springframework.event.listener.BeansException;
import demo14.org.springframework.event.listener.context.ApplicationListener;

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
