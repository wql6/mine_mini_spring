package demo30.org.springframework.lazy.aop;

public interface ClassFilter {

    boolean matches(Class<?> clazz);
}
