package demo29.org.springframework.circular.proxy.context.event;

import demo29.org.springframework.circular.proxy.context.ApplicationContext;
import demo29.org.springframework.circular.proxy.context.event.ApplicationContextEvent;

public class ContextClosedEvent extends ApplicationContextEvent {
    public ContextClosedEvent(ApplicationContext source) {
        super(source);
    }
}
