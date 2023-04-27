package demo23.org.springframework.extension.aop;

public interface ClassFilter {

    boolean matches(Class<?> clazz);
}
