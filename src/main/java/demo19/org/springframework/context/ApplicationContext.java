package demo19.org.springframework.context;

import demo19.org.springframework.BeansException;
import demo19.org.springframework.HierarchicalBeanFactory;
import demo19.org.springframework.ListableBeanFactory;
import demo19.org.springframework.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

    void refresh() throws BeansException;
}
