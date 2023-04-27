package org.springframework.test.ioc;

import demo29.org.springframework.circular.proxy.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.springframework.test.ioc.circule.A;
import org.springframework.test.ioc.circule.B;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class Demo29_CircularReferenceWithProxyBeanTest {

    @Test
    public void testCircularReference() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:circular-reference-with-proxy-bean.xml");
        A a = applicationContext.getBean("a", A.class);
        B b = applicationContext.getBean("b", B.class);

        assertThat(b.getA() == a).isTrue();

    }
}
