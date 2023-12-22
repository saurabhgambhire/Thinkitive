package com.thinkitive.inheritance.singleLevel;

public class Parent {
    String name;
    long mobile;
    int age;

    double wealth;

    public void business() {
        System.out.println(" WorkShop");
    }

    public Parent() {
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", mobile=" + mobile +
                ", age=" + age +
                ", wealth=" + wealth +
                '}';
    }
}
