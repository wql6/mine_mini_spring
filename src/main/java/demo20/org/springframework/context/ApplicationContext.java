package demo20.org.springframework.context;

import demo20.org.springframework.BeansException;
import demo20.org.springframework.HierarchicalBeanFactory;
import demo20.org.springframework.ListableBeanFactory;
import demo20.org.springframework.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

    void refresh() throws BeansException;
}
