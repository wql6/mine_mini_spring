package demo31.org.springframework.multi.advice.context.event;

import demo31.org.springframework.multi.advice.ApplicationEvent;
import demo31.org.springframework.multi.advice.context.ApplicationContext;

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
