package com.thinkitive.designpatterns.AbstractFactoryDesignPattern;

public class EmployeeFactory {
    public static Employee getEmployee(AbstractEmployeeFactory factory) {
        return factory.creatEmployee();
    }  
}
