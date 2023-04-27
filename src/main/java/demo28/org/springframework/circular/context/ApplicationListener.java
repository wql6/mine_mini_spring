package demo28.org.springframework.circular.context;

import demo28.org.springframework.circular.ApplicationEvent;

import java.util.EventListener;

public interface ApplicationListener <E extends ApplicationEvent>  extends EventListener {

    void onApplicationEvent(E event);
}
