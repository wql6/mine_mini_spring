package demo24.org.springframework.extension.context;

import demo24.org.springframework.extension.ApplicationEvent;

import java.util.EventListener;

public interface ApplicationListener <E extends ApplicationEvent>  extends EventListener {

    void onApplicationEvent(E event);
}
