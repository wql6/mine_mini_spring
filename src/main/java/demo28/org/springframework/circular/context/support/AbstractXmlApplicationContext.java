package demo28.org.springframework.circular.context.support;

import demo28.org.springframework.circular.BeansException;
import demo28.org.springframework.circular.context.support.AbstractRefreshableApplicationContext;
import demo28.org.springframework.circular.support.DefaultListableBeanFactory;
import demo28.org.springframework.circular.xml.XmlBeanDefinitionReader;

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
