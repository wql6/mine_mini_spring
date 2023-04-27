package demo31.org.springframework.multi.advice.context.event;

import demo31.org.springframework.multi.advice.ApplicationEvent;
import demo31.org.springframework.multi.advice.context.ApplicationListener;

public interface ApplicationEventMulticaster {

    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
