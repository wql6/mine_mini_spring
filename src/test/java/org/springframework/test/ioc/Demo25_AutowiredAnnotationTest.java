package org.springframework.test.ioc;

import demo25.org.springframework.extension.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.springframework.test.ioc.auto.annotation.Person;

import static org.assertj.core.api.Assertions.assertThat;

public class Demo25_AutowiredAnnotationTest {
    @Test
    public void testAutowiredAnnotation() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:autowired-annotation.xml");

        Person person = applicationContext.getBean(Person.class);
        assertThat(person.getCar()).isNotNull();
    }
}
