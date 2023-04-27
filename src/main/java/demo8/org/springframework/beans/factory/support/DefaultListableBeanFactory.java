package demo8.org.springframework.beans.factory.support;

import demo8.org.springframework.beans.BeansException;
import demo8.org.springframework.beans.ConfigurableListableBeanFactory;
import demo8.org.springframework.beans.factory.config.BeanDefinition;
import demo8.org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory
        implements ConfigurableListableBeanFactory, BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();


    public Map<String, BeanDefinition> getBeanDefinitionMap() {
        return beanDefinitionMap;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeansException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinition;
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return beanDefinitionMap.containsKey(beanName);
    }



    @Override
    public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {

        HashMap<String, T> result = new HashMap<>();
        beanDefinitionMap.forEach((beanName, beanDefinition) ->{
            Class beanClass = beanDefinition.getBeanClass();
            if(type.isAssignableFrom(beanClass)){
                T bean = (T)getBean(beanName);
                result.put(beanName, bean);
            }
        });
        return result;
    }

    @Override
    public String[] getBeanDefinitionNames() {
        Set<String> beanNames = beanDefinitionMap.keySet();
        return beanNames.toArray(new String[beanNames.size()]);
    }


}
