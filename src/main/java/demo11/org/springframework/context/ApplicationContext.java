package demo11.org.springframework.context;

import demo11.org.springframework.BeansException;
import demo11.org.springframework.factory.HierarchicalBeanFactory;
import demo11.org.springframework.factory.ListableBeanFactory;
import demo11.org.springframework.factory.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

    void refresh() throws BeansException;
}
