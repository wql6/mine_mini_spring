package demo20.org.springframework.context;

import demo20.org.springframework.Aware;
import demo20.org.springframework.BeansException;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
