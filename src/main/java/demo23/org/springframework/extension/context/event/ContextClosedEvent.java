package demo23.org.springframework.extension.context.event;

import demo23.org.springframework.extension.context.ApplicationContext;

public class ContextClosedEvent extends ApplicationContextEvent {
    public ContextClosedEvent(ApplicationContext source) {
        super(source);
    }
}
