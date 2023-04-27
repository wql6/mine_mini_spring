package demo14.org.springframework.event.listener.context;

import demo14.org.springframework.event.listener.BeansException;
import demo14.org.springframework.event.listener.HierarchicalBeanFactory;
import demo14.org.springframework.event.listener.ListableBeanFactory;
import demo14.org.springframework.event.listener.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

    void refresh() throws BeansException;
}
