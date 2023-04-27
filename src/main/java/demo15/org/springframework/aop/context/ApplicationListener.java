package demo15.org.springframework.aop.context;

import demo15.org.springframework.aop.ApplicationEvent;

import java.util.EventListener;

public interface ApplicationListener <E extends ApplicationEvent>  extends EventListener {

    void onApplicationEvent(E event);
}
