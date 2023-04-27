package demo29.org.springframework.circular.proxy.context;

import demo29.org.springframework.circular.proxy.BeansException;
import demo29.org.springframework.circular.proxy.HierarchicalBeanFactory;
import demo29.org.springframework.circular.proxy.ListableBeanFactory;
import demo29.org.springframework.circular.proxy.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

    void refresh() throws BeansException;
}
