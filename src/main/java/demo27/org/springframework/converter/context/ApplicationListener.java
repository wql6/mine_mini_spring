package demo27.org.springframework.converter.context;

import demo27.org.springframework.converter.ApplicationEvent;

import java.util.EventListener;

public interface ApplicationListener <E extends ApplicationEvent>  extends EventListener {

    void onApplicationEvent(E event);
}
