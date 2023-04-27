package demo29.org.springframework.circular.proxy.aop;

public interface ClassFilter {

    boolean matches(Class<?> clazz);
}
