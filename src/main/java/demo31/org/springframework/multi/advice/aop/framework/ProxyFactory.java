package demo31.org.springframework.multi.advice.aop.framework;

import demo31.org.springframework.multi.advice.aop.AdvisedSupport;
import demo31.org.springframework.multi.advice.aop.framework.AopProxy;
import demo31.org.springframework.multi.advice.aop.framework.CglibAopProxy;
import demo31.org.springframework.multi.advice.aop.framework.JdkDynamicAopProxy;

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
