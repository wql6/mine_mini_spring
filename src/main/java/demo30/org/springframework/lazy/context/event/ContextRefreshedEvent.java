package demo30.org.springframework.lazy.context.event;

import demo30.org.springframework.lazy.context.ApplicationContext;
import demo30.org.springframework.lazy.context.event.ApplicationContextEvent;

/**
 * @author derekyi
 * @date 2020/12/2
 */
public class ContextRefreshedEvent extends ApplicationContextEvent {

	public ContextRefreshedEvent(ApplicationContext source) {
		super(source);
	}
}
