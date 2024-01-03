package com.thinkitive.designpatterns.builderDesign;

public class Employee {
    private final int emp_id;
    private final String name;
    private final String mobile;

    private Employee(InnerEmployee innerEmployee){
        // initilize the variable
        this.emp_id = innerEmployee.emp_id;
        this.name = innerEmployee.name;
        this.mobile = innerEmployee.mobile;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public static class InnerEmployee {
    
        private int emp_id;
        private String name;
        private String mobile;

        InnerEmployee(){

        }

        public InnerEmployee setEmp_id(int emp_id) {
            this.emp_id = emp_id;
            return this;
        }

        public InnerEmployee setName(String name) {
            this.name = name;
            return this;
        }

        public InnerEmployee setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Employee build(){
            Employee employee = new Employee(this);
            return employee;
        }
    }

    @Override
    public String toString() {
        return "Employee [emp_id=" + emp_id + ", name=" + name + ", mobile=" + mobile + "]";
    }
}
