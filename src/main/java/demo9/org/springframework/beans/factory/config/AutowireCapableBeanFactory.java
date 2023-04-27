package demo9.org.springframework.beans.factory.config;

import demo9.org.springframework.beans.BeanFactory;
import demo9.org.springframework.beans.BeansException;

/**
 * @author derekyi
 * @date 2020/11/28
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    Object applyBeanPostProcessorBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    Object applyBeanPostProcessorAfterInitialization(Object existingBean, String beanName) throws BeansException;



}
