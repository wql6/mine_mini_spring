package demo23.org.springframework.extension.context.event;

import demo23.org.springframework.extension.ApplicationEvent;
import demo23.org.springframework.extension.context.ApplicationListener;

public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
