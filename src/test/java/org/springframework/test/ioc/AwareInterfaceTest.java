package org.springframework.test.ioc;

import demo11.org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.springframework.test.ioc.service.HelloService;

import static org.assertj.core.api.Assertions.assertThat;

public class AwareInterfaceTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:demo11-spring.xml");
        HelloService helloService = applicationContext.getBean("helloService", HelloService.class);
        assertThat(helloService.getApplicationContext()).isNotNull();
        assertThat(helloService.getBeanFactory()).isNotNull();
    }
}
