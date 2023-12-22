package com.thinkitive.inheritance.multiLevel;

public class Driver {
    public static void main(String[] args) {
        C c = new C();
        c.hello_C();
        c.hello_B();
        c.hello_A();
    }
}
