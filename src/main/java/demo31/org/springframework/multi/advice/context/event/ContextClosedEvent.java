package demo31.org.springframework.multi.advice.context.event;

import demo31.org.springframework.multi.advice.context.ApplicationContext;
import demo31.org.springframework.multi.advice.context.event.ApplicationContextEvent;

public class ContextClosedEvent extends ApplicationContextEvent {
    public ContextClosedEvent(ApplicationContext source) {
        super(source);
    }
}
