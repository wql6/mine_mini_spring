package demo14.org.springframework.event.listener.context;

import demo14.org.springframework.event.listener.Aware;
import demo14.org.springframework.event.listener.BeansException;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
