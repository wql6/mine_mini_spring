package demo19.org.springframework.config;

import demo19.org.springframework.BeanFactory;
import demo19.org.springframework.BeansException;

/**
 * @author derekyi
 * @date 2020/11/28
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    Object applyBeanPostProcessorBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    Object applyBeanPostProcessorAfterInitialization(Object existingBean, String beanName) throws BeansException;



}
