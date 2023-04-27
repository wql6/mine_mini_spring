package demo30.org.springframework.lazy.context.event;

import demo30.org.springframework.lazy.ApplicationEvent;
import demo30.org.springframework.lazy.context.ApplicationListener;

public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
