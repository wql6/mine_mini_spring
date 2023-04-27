package demo11.org.springframework.context;

import demo11.org.springframework.Aware;
import demo11.org.springframework.BeansException;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
