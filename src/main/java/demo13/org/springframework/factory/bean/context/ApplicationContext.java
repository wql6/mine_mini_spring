package demo13.org.springframework.factory.bean.context;

import demo13.org.springframework.factory.bean.BeansException;
import demo13.org.springframework.factory.bean.factory.HierarchicalBeanFactory;
import demo13.org.springframework.factory.bean.factory.ListableBeanFactory;
import demo13.org.springframework.factory.bean.factory.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

    void refresh() throws BeansException;
}
