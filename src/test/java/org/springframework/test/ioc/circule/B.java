package org.springframework.test.ioc.circule;

public class B {

    private A a;

    public void func(){
        System.out.println("B");
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
