package demo7.org.springframework.beans;

import demo7.org.springframework.beans.factory.ListableBeanFactory;
import demo7.org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import demo7.org.springframework.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {
}
