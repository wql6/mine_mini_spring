package demo29.org.springframework.circular.proxy.context.support;

import demo29.org.springframework.circular.proxy.BeansException;
import demo29.org.springframework.circular.proxy.context.support.AbstractXmlApplicationContext;

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
