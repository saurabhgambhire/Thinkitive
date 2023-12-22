package com.thinkitive.inheritance.multiLevel;

import javax.lang.model.element.NestingKind;

public class C extends B {

    int id;
    String name;

    C() {

    }

    public void hello_C() {
        System.out.println("Hello from C");
    }
}
