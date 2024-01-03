package com.thinkitive.designpatterns.AbstractFactoryDesignPattern;


public class EmployeeDriver {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        System.out.println(employee.name());
    }
}
