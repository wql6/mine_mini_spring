package demo19.org.springframework.context;

import demo19.org.springframework.Aware;
import demo19.org.springframework.BeansException;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
