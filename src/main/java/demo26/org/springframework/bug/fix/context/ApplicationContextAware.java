package demo26.org.springframework.bug.fix.context;

import demo26.org.springframework.bug.fix.Aware;
import demo26.org.springframework.bug.fix.BeansException;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
