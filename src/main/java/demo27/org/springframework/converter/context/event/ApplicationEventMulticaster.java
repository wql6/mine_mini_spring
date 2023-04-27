package demo27.org.springframework.converter.context.event;

import demo27.org.springframework.converter.ApplicationEvent;
import demo27.org.springframework.converter.context.ApplicationListener;

public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
