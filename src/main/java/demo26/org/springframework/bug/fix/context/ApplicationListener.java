package demo26.org.springframework.bug.fix.context;

import demo26.org.springframework.bug.fix.ApplicationEvent;

import java.util.EventListener;

public interface ApplicationListener <E extends ApplicationEvent>  extends EventListener {

    void onApplicationEvent(E event);
}
