package demo14.org.springframework.event.listener;

public interface DisposableBean {

    void destroy() throws Exception;
}
