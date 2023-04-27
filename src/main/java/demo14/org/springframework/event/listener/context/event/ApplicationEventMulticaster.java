package demo14.org.springframework.event.listener.context.event;

import demo14.org.springframework.event.listener.ApplicationEvent;
import demo14.org.springframework.event.listener.context.ApplicationListener;

public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
