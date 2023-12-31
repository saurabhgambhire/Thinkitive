package com.thinkitive.encapsulation.entity;

public class Employee {
    private int id;
    private String name;
    private String mobile;
    private String designation;
    private String password;


    public Employee() {
    }

    public Employee(int id, String name, String mobile, String designation, String password) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.designation = designation;
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobile(int id, String password) {
        if (id == 5757 && password.equals("saurabh"))
            return mobile;

        return "Please provide Valid Credentials ";
    }

    public String getDesignation() {
        return designation;
    }

    public String getPassword(int id, String old_password) {
        if (id == 5757 && old_password.equals("saurabh"))
            return password;

        return "Please Provide Valid Credentials";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
