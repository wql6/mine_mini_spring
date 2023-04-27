package demo31.org.springframework.multi.advice.context;

import demo31.org.springframework.multi.advice.ApplicationEvent;

import java.util.EventListener;

public interface ApplicationListener <E extends ApplicationEvent>  extends EventListener {

    void onApplicationEvent(E event);
}
