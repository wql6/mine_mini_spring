package demo26.org.springframework.bug.fix.context.event;

import demo26.org.springframework.bug.fix.ApplicationEvent;
import demo26.org.springframework.bug.fix.context.ApplicationListener;

public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
