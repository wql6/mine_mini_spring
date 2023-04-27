package demo24.org.springframework.extension.context;

import demo24.org.springframework.extension.BeansException;
import demo24.org.springframework.extension.HierarchicalBeanFactory;
import demo24.org.springframework.extension.ListableBeanFactory;
import demo24.org.springframework.extension.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

    void refresh() throws BeansException;
}
