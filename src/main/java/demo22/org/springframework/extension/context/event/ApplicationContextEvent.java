package demo22.org.springframework.extension.context.event;

import demo22.org.springframework.extension.ApplicationEvent;
import demo22.org.springframework.extension.context.ApplicationContext;

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
