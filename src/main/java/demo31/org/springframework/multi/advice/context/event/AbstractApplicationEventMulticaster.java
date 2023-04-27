package demo31.org.springframework.multi.advice.context.event;

import demo31.org.springframework.multi.advice.ApplicationEvent;
import demo31.org.springframework.multi.advice.BeanFactory;
import demo31.org.springframework.multi.advice.BeanFactoryAware;
import demo31.org.springframework.multi.advice.BeansException;
import demo31.org.springframework.multi.advice.context.ApplicationListener;
import demo31.org.springframework.multi.advice.context.event.ApplicationEventMulticaster;

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
