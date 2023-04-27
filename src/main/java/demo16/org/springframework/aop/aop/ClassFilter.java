package demo16.org.springframework.aop.aop;

public interface ClassFilter {

    boolean matches(Class<?> clazz);
}
