package demo31.org.springframework.multi.advice.aop;

import demo31.org.springframework.multi.advice.AdvisorChainFactory;
import demo31.org.springframework.multi.advice.DefaultAdvisorChainFactory;
import demo31.org.springframework.multi.advice.aop.MethodMatcher;
import demo31.org.springframework.multi.advice.aop.TargetSource;
import org.aopalliance.intercept.MethodInterceptor;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author derekyi
 * @date 2020/12/6
 */
public class AdvisedSupport {

	private TargetSource targetSource;

	private MethodInterceptor methodInterceptor;

	private MethodMatcher methodMatcher;

	private boolean proxyTargetClass = false;

	private List<Advisor> advisors = new ArrayList<>();

	AdvisorChainFactory advisorChainFactory = new DefaultAdvisorChainFactory();

	private transient Map<Integer, List<Object>> methodCache;

	public AdvisedSupport() {
		this.methodCache = new ConcurrentHashMap<>(32);
	}

	public boolean isProxyTargetClass() {
		return proxyTargetClass;
	}

	public List<Advisor> getAdvisors() {
		return advisors;
	}

	public void setProxyTargetClass(boolean proxyTargetClass) {
		this.proxyTargetClass = proxyTargetClass;
	}

	public TargetSource getTargetSource() {
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

	public MethodMatcher getMethodMatcher() {
		return methodMatcher;
	}

	public void setMethodMatcher(MethodMatcher methodMatcher) {
		this.methodMatcher = methodMatcher;
	}


	public List<Object> getInterceptorsAndDynamicInterceptionAdvice(Method method, Class<?> targetClass){
		Integer cacheKey=method.hashCode();
		List<Object> cached = this.methodCache.get(cacheKey);
		if (cached == null) {
			cached = this.advisorChainFactory.getInterceptorsAndDynamicInterceptionAdvice(
					this, method, targetClass);
			this.methodCache.put(cacheKey, cached);
		}
		return cached;

	}
}
