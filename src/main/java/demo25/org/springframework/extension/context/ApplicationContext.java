package demo25.org.springframework.extension.context;

import demo25.org.springframework.extension.BeansException;
import demo25.org.springframework.extension.HierarchicalBeanFactory;
import demo25.org.springframework.extension.ListableBeanFactory;
import demo25.org.springframework.extension.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

    void refresh() throws BeansException;
}
