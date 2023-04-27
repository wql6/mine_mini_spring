package demo31.org.springframework.multi.advice.context.support;

import demo31.org.springframework.multi.advice.BeansException;
import demo31.org.springframework.multi.advice.context.support.AbstractXmlApplicationContext;

public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext {

    private String[] configLocations;

    public ClassPathXmlApplicationContext(String configLocation) throws BeansException {
        this(new String[]{configLocation});
    }

    public ClassPathXmlApplicationContext(String[] configLocations) throws BeansException {
        this.configLocations = configLocations;
        refresh();
    }

    protected String[] getConfigLocations() {
        return this.configLocations;
    }


}
