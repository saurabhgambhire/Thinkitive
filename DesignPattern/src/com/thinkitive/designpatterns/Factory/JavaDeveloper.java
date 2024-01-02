package com.thinkitive.designpatterns.Factory;

public class JavaDeveloper implements Employee {
    public int salary() {
        System.out.println("This is Java Developer Salary");
        return 70000;
    }
}
