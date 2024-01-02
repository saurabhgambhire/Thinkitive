package com.thinkitive.designpatterns.Factory;

public class EmployeeFactory {
    EmployeeFactory() {
    }

    public Employee getEmployee(String empType) {
        if (empType.trim().equalsIgnoreCase("AndroidDeveloper")) {
            return new AndroidDeveloper();
        } else if (empType.trim().equalsIgnoreCase("JavaDeveloper")) {
            return new JavaDeveloper();
        }
        return null;
    }
}
