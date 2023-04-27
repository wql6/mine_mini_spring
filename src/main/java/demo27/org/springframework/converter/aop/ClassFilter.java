package demo27.org.springframework.converter.aop;

public interface ClassFilter {

    boolean matches(Class<?> clazz);
}
