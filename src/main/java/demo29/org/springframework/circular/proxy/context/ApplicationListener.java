package demo29.org.springframework.circular.proxy.context;

import demo29.org.springframework.circular.proxy.ApplicationEvent;

import java.util.EventListener;

public interface ApplicationListener <E extends ApplicationEvent>  extends EventListener {

    void onApplicationEvent(E event);
}
