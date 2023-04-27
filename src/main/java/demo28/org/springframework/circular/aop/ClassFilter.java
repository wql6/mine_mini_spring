package demo28.org.springframework.circular.aop;

public interface ClassFilter {

    boolean matches(Class<?> clazz);
}
