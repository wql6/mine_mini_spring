package demo28.org.springframework.circular.context;

import demo28.org.springframework.circular.BeansException;
import demo28.org.springframework.circular.HierarchicalBeanFactory;
import demo28.org.springframework.circular.ListableBeanFactory;
import demo28.org.springframework.circular.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

    void refresh() throws BeansException;
}
