package demo22.org.springframework.extension.context.event;

import demo22.org.springframework.extension.context.ApplicationContext;

public class ContextClosedEvent extends ApplicationContextEvent {
    public ContextClosedEvent(ApplicationContext source) {
        super(source);
    }
}
