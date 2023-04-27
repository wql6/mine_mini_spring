package demo19.org.springframework.context;

import demo19.org.springframework.ApplicationEvent;

import java.util.EventListener;

public interface ApplicationListener <E extends ApplicationEvent>  extends EventListener {

    void onApplicationEvent(E event);
}
