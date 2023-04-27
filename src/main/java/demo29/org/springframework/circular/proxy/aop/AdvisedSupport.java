package demo29.org.springframework.circular.proxy.aop;

import demo29.org.springframework.circular.proxy.aop.MethodMatcher;
import demo29.org.springframework.circular.proxy.aop.TargetSource;
import org.aopalliance.intercept.MethodInterceptor;

/**
 * @author derekyi
 * @date 2020/12/6
 */
public class AdvisedSupport {

	private demo29.org.springframework.circular.proxy.aop.TargetSource targetSource;

	private MethodInterceptor methodInterceptor;

	private demo29.org.springframework.circular.proxy.aop.MethodMatcher methodMatcher;

	private boolean proxyTargetClass = false;

	public boolean isProxyTargetClass() {
		return proxyTargetClass;
	}

	public void setProxyTargetClass(boolean proxyTargetClass) {
		this.proxyTargetClass = proxyTargetClass;
	}

	public demo29.org.springframework.circular.proxy.aop.TargetSource getTargetSource() {
		return targetSource;
	}

	public void setTargetSource(TargetSource targetSource) {
		this.targetSource = targetSource;
	}

	public MethodInterceptor getMethodInterceptor() {
		return methodInterceptor;
	}

	public void setMethodInterceptor(MethodInterceptor methodInterceptor) {
		this.methodInterceptor = methodInterceptor;
	}

	public demo29.org.springframework.circular.proxy.aop.MethodMatcher getMethodMatcher() {
		return methodMatcher;
	}

	public void setMethodMatcher(MethodMatcher methodMatcher) {
		this.methodMatcher = methodMatcher;
	}
}
