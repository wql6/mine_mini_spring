package demo26.org.springframework.bug.fix.aop;

public interface ClassFilter {

    boolean matches(Class<?> clazz);
}
