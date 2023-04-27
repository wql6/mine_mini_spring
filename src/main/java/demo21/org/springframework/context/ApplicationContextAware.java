package demo21.org.springframework.context;

import demo21.org.springframework.Aware;
import demo21.org.springframework.BeansException;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
