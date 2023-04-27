package demo29.org.springframework.circular.proxy.context.event;

import demo29.org.springframework.circular.proxy.ApplicationEvent;
import demo29.org.springframework.circular.proxy.context.ApplicationListener;

public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
