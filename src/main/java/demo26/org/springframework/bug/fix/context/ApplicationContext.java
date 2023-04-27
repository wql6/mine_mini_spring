package demo26.org.springframework.bug.fix.context;

import demo26.org.springframework.bug.fix.BeansException;
import demo26.org.springframework.bug.fix.HierarchicalBeanFactory;
import demo26.org.springframework.bug.fix.ListableBeanFactory;
import demo26.org.springframework.bug.fix.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

    void refresh() throws BeansException;
}
