package demo30.org.springframework.lazy.context.support;

import demo30.org.springframework.lazy.BeansException;
import demo30.org.springframework.lazy.context.support.AbstractRefreshableApplicationContext;
import demo30.org.springframework.lazy.support.DefaultListableBeanFactory;
import demo30.org.springframework.lazy.xml.XmlBeanDefinitionReader;

public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {
    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) throws BeansException {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (configLocations != null) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
