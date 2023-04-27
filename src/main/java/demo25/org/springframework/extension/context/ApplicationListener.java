package demo25.org.springframework.extension.context;

import demo25.org.springframework.extension.ApplicationEvent;

import java.util.EventListener;

public interface ApplicationListener <E extends ApplicationEvent>  extends EventListener {

    void onApplicationEvent(E event);
}
