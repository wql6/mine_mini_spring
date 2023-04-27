package demo18.org.springframework.aop.context.event;

import demo18.org.springframework.aop.ApplicationEvent;
import demo18.org.springframework.aop.context.ApplicationListener;

public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
