package org.springframework.test.ioc.circule;

public class A {

    private B b;

    public void func(){}

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
