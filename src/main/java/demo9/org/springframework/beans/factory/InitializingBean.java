package demo9.org.springframework.beans.factory;

public interface InitializingBean {

    void afterPropertiesSet() throws Exception;
}
