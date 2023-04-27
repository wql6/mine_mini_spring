package demo25.org.springframework.extension.context.event;

import demo25.org.springframework.extension.ApplicationEvent;
import demo25.org.springframework.extension.context.ApplicationListener;

public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
