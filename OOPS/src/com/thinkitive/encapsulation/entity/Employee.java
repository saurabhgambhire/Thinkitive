package com.thinkitive.encapsulation.entity;

public class Employee {
    private int id;
    private String name;
    private String mobile;
    private String designation;
    private String password;


    public Employee() {
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

    public String getPassword(int id, String old_password, String email) {
        if (id == 5757 && old_password.equals("saurabh") && email.equals("saurabhgambhire@gmail.com"))
            return password;

        return "Please Provide Valid Credentials";
    }
}
