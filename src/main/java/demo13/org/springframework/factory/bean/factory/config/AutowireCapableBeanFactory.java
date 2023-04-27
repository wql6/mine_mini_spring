package demo13.org.springframework.factory.bean.factory.config;

import demo13.org.springframework.factory.bean.BeanFactory;
import demo13.org.springframework.factory.bean.BeansException;

/**
 * @author derekyi
 * @date 2020/11/28
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    Object applyBeanPostProcessorBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    Object applyBeanPostProcessorAfterInitialization(Object existingBean, String beanName) throws BeansException;



}
