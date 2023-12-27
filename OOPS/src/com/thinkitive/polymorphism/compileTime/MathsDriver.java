package com.thinkitive.polymorphism.compileTime;

public class MathsDriver {
    public static void main(String[] args) {
        Maths maths = new Maths();
        maths.add(12,23);
        maths.add(1.2,23);
        maths.add(1,2.4);
        maths.add(1.43,23.83);
        maths.add(23,54,64);
    }
}
