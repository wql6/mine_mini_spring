package org.springframework.test.ioc;

import org.junit.Test;
import demo1.org.springframework.beans.factory.BeanFactory;
import static org.assertj.core.api.Assertions.assertThat;


public class SimpleBeanContainerTest {

    @Test
    public void testGetBean(){
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService", new HelloService());
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        assertThat(helloService).isNotNull();
        assertThat(helloService.sayHello()).isEqualTo("hello");
    }

    class HelloService {
        public String sayHello() {
            System.out.println("hello");
            return "hello";
        }
    }
}
