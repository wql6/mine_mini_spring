package demo26.org.springframework.bug.fix;

public interface DisposableBean {

    void destroy() throws Exception;
}
