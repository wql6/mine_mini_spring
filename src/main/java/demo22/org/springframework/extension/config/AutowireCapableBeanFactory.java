package demo22.org.springframework.extension.config;

import demo22.org.springframework.extension.BeanFactory;
import demo22.org.springframework.extension.BeansException;

/**
 * @author derekyi
 * @date 2020/11/28
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    Object applyBeanPostProcessorBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    Object applyBeanPostProcessorAfterInitialization(Object existingBean, String beanName) throws BeansException;



}
