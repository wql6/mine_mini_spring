package demo28.org.springframework.circular.context.event;

import demo28.org.springframework.circular.context.ApplicationContext;
import demo28.org.springframework.circular.context.event.ApplicationContextEvent;

public class ContextClosedEvent extends ApplicationContextEvent {
    public ContextClosedEvent(ApplicationContext source) {
        super(source);
    }
}
