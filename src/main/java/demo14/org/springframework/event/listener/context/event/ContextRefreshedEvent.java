package demo14.org.springframework.event.listener.context.event;

import demo14.org.springframework.event.listener.context.ApplicationContext;
/**
 * @author derekyi
 * @date 2020/12/2
 */
public class ContextRefreshedEvent extends ApplicationContextEvent {

	public ContextRefreshedEvent(ApplicationContext source) {
		super(source);
	}
}
