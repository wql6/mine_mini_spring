package demo22.org.springframework.extension.aop;

public interface ClassFilter {

    boolean matches(Class<?> clazz);
}
