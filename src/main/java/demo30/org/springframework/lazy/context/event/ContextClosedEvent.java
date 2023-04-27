package demo30.org.springframework.lazy.context.event;

import demo30.org.springframework.lazy.context.ApplicationContext;
import demo30.org.springframework.lazy.context.event.ApplicationContextEvent;

public class ContextClosedEvent extends ApplicationContextEvent {
    public ContextClosedEvent(ApplicationContext source) {
        super(source);
    }
}
