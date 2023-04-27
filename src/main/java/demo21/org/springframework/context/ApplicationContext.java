package demo21.org.springframework.context;

import demo21.org.springframework.BeansException;
import demo21.org.springframework.HierarchicalBeanFactory;
import demo21.org.springframework.ListableBeanFactory;
import demo21.org.springframework.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

    void refresh() throws BeansException;
}
