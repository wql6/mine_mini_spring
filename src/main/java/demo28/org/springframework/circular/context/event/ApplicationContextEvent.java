package demo28.org.springframework.circular.context.event;

import demo28.org.springframework.circular.ApplicationEvent;
import demo28.org.springframework.circular.context.ApplicationContext;

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
