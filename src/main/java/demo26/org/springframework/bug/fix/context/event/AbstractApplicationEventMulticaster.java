package demo26.org.springframework.bug.fix.context.event;

import demo26.org.springframework.bug.fix.ApplicationEvent;
import demo26.org.springframework.bug.fix.BeanFactory;
import demo26.org.springframework.bug.fix.BeanFactoryAware;
import demo26.org.springframework.bug.fix.BeansException;
import demo26.org.springframework.bug.fix.context.ApplicationListener;

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
