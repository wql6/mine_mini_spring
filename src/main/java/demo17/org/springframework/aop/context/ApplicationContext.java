package demo17.org.springframework.aop.context;

import demo17.org.springframework.aop.BeansException;
import demo17.org.springframework.aop.HierarchicalBeanFactory;
import demo17.org.springframework.aop.ListableBeanFactory;
import demo17.org.springframework.aop.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

    void refresh() throws BeansException;
}
