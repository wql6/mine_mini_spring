package demo30.org.springframework.lazy.context.support;

import demo30.org.springframework.lazy.BeansException;
import demo30.org.springframework.lazy.context.support.AbstractXmlApplicationContext;

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
