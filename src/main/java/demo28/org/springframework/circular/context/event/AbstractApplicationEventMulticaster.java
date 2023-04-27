package demo28.org.springframework.circular.context.event;

import demo28.org.springframework.circular.ApplicationEvent;
import demo28.org.springframework.circular.BeanFactory;
import demo28.org.springframework.circular.BeanFactoryAware;
import demo28.org.springframework.circular.BeansException;
import demo28.org.springframework.circular.context.ApplicationListener;
import demo28.org.springframework.circular.context.event.ApplicationEventMulticaster;

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
