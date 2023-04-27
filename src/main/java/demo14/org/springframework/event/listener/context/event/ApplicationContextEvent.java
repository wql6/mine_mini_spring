package demo14.org.springframework.event.listener.context.event;

import demo14.org.springframework.event.listener.ApplicationEvent;
import demo14.org.springframework.event.listener.context.ApplicationContext;

/**
 * @author derekyi
 * @date 2020/12/2
 */
public abstract class ApplicationContextEvent extends ApplicationEvent {

	public ApplicationContextEvent(ApplicationContext source) {
		super(source);
	}

	public final ApplicationContext getApplicationContext() {
		return (ApplicationContext) getSource();
	}
}
