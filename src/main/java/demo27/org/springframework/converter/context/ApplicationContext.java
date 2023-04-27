package demo27.org.springframework.converter.context;

import demo27.org.springframework.converter.BeansException;
import demo27.org.springframework.converter.HierarchicalBeanFactory;
import demo27.org.springframework.converter.ListableBeanFactory;
import demo27.org.springframework.converter.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

    void refresh() throws BeansException;
}
