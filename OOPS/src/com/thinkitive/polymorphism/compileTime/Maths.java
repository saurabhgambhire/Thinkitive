package com.thinkitive.polymorphism.compileTime;

public class Maths {
    public void add(int a, int b) {
        System.out.println("Addition is : " + a + b);
    }

    public void add(int a, double b) {
        System.out.println("Addition is : " + a + b);
    }

    public void add(double a, double b) {
        System.out.println("Addition is : " + (a + b));
    }

    public void add(int a, float b) {
        System.out.println("Addition is : " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Addition is : " + (a + b + c));
    }
}
