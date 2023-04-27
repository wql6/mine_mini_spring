package demo21.org.springframework.aop;

public interface ClassFilter {

    boolean matches(Class<?> clazz);
}
