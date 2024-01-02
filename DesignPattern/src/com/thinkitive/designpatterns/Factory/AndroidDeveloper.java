package com.thinkitive.designpatterns.Factory;

public class AndroidDeveloper implements Employee {
    public int salary() {
        System.out.println("This is Android Developer Salary : ");
        return 50000;
    }
}
