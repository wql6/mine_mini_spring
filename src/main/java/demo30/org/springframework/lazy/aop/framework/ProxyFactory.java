package demo30.org.springframework.lazy.aop.framework;

import demo30.org.springframework.lazy.aop.AdvisedSupport;
import demo30.org.springframework.lazy.aop.framework.AopProxy;
import demo30.org.springframework.lazy.aop.framework.CglibAopProxy;
import demo30.org.springframework.lazy.aop.framework.JdkDynamicAopProxy;

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
