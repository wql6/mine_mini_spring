package demo31.org.springframework.multi.advice.context.support;

import demo31.org.springframework.multi.advice.BeansException;
import demo31.org.springframework.multi.advice.context.support.AbstractRefreshableApplicationContext;
import demo31.org.springframework.multi.advice.support.DefaultListableBeanFactory;
import demo31.org.springframework.multi.advice.xml.XmlBeanDefinitionReader;

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
