package demo31.org.springframework.multi.advice.aop;

public interface ClassFilter {

    boolean matches(Class<?> clazz);
}
