package demo29.org.springframework.circular.proxy.aop.framework;

import demo29.org.springframework.circular.proxy.aop.AdvisedSupport;
import demo29.org.springframework.circular.proxy.aop.framework.AopProxy;
import demo29.org.springframework.circular.proxy.aop.framework.CglibAopProxy;
import demo29.org.springframework.circular.proxy.aop.framework.JdkDynamicAopProxy;

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
