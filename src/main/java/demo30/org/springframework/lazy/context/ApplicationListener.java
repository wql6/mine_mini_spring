package demo30.org.springframework.lazy.context;

import demo30.org.springframework.lazy.ApplicationEvent;

import java.util.EventListener;

public interface ApplicationListener <E extends ApplicationEvent>  extends EventListener {

    void onApplicationEvent(E event);
}
