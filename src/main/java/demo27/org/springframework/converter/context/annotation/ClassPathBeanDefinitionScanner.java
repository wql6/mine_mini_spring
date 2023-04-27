package demo27.org.springframework.converter.context.annotation;

import cn.hutool.core.util.StrUtil;
import demo27.org.springframework.converter.annotaion.AutowiredAnnotationBeanPostProcessor;
import demo27.org.springframework.converter.config.BeanDefinition;
import demo27.org.springframework.converter.stereotype.Component;
import demo27.org.springframework.converter.support.BeanDefinitionRegistry;

import java.util.Set;

public class ClassPathBeanDefinitionScanner extends ClassPathScanningCandidateComponentProvider {

    public static final String AUTOWIRED_ANNOTATION_PROCESSOR_BEAN_NAME = "org.springframework.context.annotation.internalAutowiredAnnotationProcessor";


    private BeanDefinitionRegistry registry;

    public ClassPathBeanDefinitionScanner(BeanDefinitionRegistry registry){
        this.registry = registry;
    }
    
    public void doScan(String... backPackages){
        for (String backPackage : backPackages) {
            Set<BeanDefinition> candidateComponents = findCandidateComponents(backPackage);
            for (BeanDefinition candidate : candidateComponents) {
                String beanScope = resolveBeanScope(candidate);
                if(StrUtil.isNotEmpty(beanScope)){
                    candidate.setScope(beanScope);
                }
                String beanName = determineBeanName(candidate);
                registry.registerBeanDefinition(beanName, candidate);
            }
        }

        registry.registerBeanDefinition(AUTOWIRED_ANNOTATION_PROCESSOR_BEAN_NAME, new BeanDefinition(AutowiredAnnotationBeanPostProcessor.class));
    }

    private String determineBeanName(BeanDefinition beanDefinition){
        Class beanClass = beanDefinition.getBeanClass();
        Component component = (Component) beanClass.getAnnotation(Component.class);
        String value = component.value();
        if(StrUtil.isEmpty(value)){
            value = StrUtil.lowerFirst(beanClass.getSimpleName());
        }
        return value;
    }

    private String resolveBeanScope(BeanDefinition beanDefinition){
        Class beanClass = beanDefinition.getBeanClass();
        Scope scope = (Scope) beanClass.getAnnotation(Scope.class);
        if( scope != null){
            return scope.value();
        }
        return StrUtil.EMPTY;
    }


}
