package demo16.org.springframework.aop.context.event;

import demo16.org.springframework.aop.ApplicationEvent;
import demo16.org.springframework.aop.context.ApplicationListener;

public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
