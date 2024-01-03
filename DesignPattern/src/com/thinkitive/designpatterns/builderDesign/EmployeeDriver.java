package com.thinkitive.designpatterns.builderDesign;


public class EmployeeDriver {
    public static void main(String[] args) {
    Employee employee = new Employee.InnerEmployee().setEmp_id(471).setName("Saurabh").setMobile("9359691331").build();
    System.out.println(employee);
    }
}
