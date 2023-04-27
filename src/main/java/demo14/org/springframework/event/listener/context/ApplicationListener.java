package demo14.org.springframework.event.listener.context;

import demo14.org.springframework.event.listener.ApplicationEvent;

import java.util.EventListener;

public interface ApplicationListener <E extends ApplicationEvent>  extends EventListener {

    void onApplicationEvent(E event);
}
