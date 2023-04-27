package demo27.org.springframework.converter.aop.framework;

import demo27.org.springframework.converter.aop.AdvisedSupport;

public class ProxyFactory {

    private AdvisedSupport advisedSupport;

    public ProxyFactory(AdvisedSupport advisedSupport){this.advisedSupport = advisedSupport;}

    public Object getProxy(){ return createAopProxy().getProxy(); }

    private AopProxy createAopProxy(){
        if (advisedSupport.isProxyTargetClass()) {
            return new CglibAopProxy(advisedSupport);
        }

        return new JdkDynamicAopProxy(advisedSupport);
    }
}
