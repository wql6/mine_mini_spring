package demo14.org.springframework.event.listener.context.event;

import demo14.org.springframework.event.listener.context.ApplicationContext;

public class ContextClosedEvent extends ApplicationContextEvent{
    public ContextClosedEvent(ApplicationContext source) {
        super(source);
    }
}
