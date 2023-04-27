package demo12.org.springframework.context;

import demo12.org.springframework.Aware;
import demo12.org.springframework.BeansException;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
