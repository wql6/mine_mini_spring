package demo31.org.springframework.multi.advice.context;

import demo31.org.springframework.multi.advice.BeansException;
import demo31.org.springframework.multi.advice.HierarchicalBeanFactory;
import demo31.org.springframework.multi.advice.ListableBeanFactory;
import demo31.org.springframework.multi.advice.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author derekyi
 * @date 2020/11/28
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

    void refresh() throws BeansException;
}
