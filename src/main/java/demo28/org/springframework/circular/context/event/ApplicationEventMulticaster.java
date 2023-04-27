package demo28.org.springframework.circular.context.event;

import demo28.org.springframework.circular.ApplicationEvent;
import demo28.org.springframework.circular.context.ApplicationListener;

public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
