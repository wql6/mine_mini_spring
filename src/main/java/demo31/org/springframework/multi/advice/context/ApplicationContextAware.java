package demo31.org.springframework.multi.advice.context;

import demo31.org.springframework.multi.advice.Aware;
import demo31.org.springframework.multi.advice.BeansException;
import demo31.org.springframework.multi.advice.context.ApplicationContext;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
