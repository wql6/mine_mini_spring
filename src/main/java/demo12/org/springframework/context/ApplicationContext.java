package demo12.org.springframework.context;

import demo12.org.springframework.BeansException;
import demo12.org.springframework.factory.HierarchicalBeanFactory;
import demo12.org.springframework.factory.ListableBeanFactory;
import demo12.org.springframework.factory.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

    void refresh() throws BeansException;
}
