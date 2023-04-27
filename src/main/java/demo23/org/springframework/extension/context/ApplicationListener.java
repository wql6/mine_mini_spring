package demo23.org.springframework.extension.context;

import demo23.org.springframework.extension.ApplicationEvent;

import java.util.EventListener;

public interface ApplicationListener <E extends ApplicationEvent>  extends EventListener {

    void onApplicationEvent(E event);
}
