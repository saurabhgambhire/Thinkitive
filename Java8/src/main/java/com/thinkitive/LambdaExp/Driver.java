package com.thinkitive.LambdaExp;

public class Driver {
    public static void main(String[] args) {
        BasicLambda lambda = (a, b) -> System.out.println(a + b);
        lambda.m1(2, 4);
    }
}
