package demo9.org.springframework.beans.context;

import demo9.org.springframework.beans.BeansException;
import demo9.org.springframework.beans.factory.HierarchicalBeanFactory;
import demo9.org.springframework.beans.factory.ListableBeanFactory;
import demo9.org.springframework.beans.factory.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

    void refresh() throws BeansException;
}
