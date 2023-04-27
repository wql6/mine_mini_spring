package demo30.org.springframework.lazy.context;

import demo30.org.springframework.lazy.BeansException;
import demo30.org.springframework.lazy.HierarchicalBeanFactory;
import demo30.org.springframework.lazy.ListableBeanFactory;
import demo30.org.springframework.lazy.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

    void refresh() throws BeansException;
}
