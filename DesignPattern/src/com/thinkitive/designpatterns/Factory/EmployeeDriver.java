package com.thinkitive.designpatterns.Factory;

public class EmployeeDriver {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee employee = employeeFactory.getEmployee("AndroidDeveloper");
        System.out.println(employee.salary());
        employee = employeeFactory.getEmployee("Javadeveloper");
        System.out.println(employee.salary());
    }
}
