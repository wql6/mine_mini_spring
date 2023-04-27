package demo27.org.springframework.converter.context.event;

import demo27.org.springframework.converter.context.ApplicationContext;

public class ContextClosedEvent extends ApplicationContextEvent {
    public ContextClosedEvent(ApplicationContext source) {
        super(source);
    }
}
