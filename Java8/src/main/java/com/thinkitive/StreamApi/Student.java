package com.thinkitive.StreamApi;

public class Student {
    private int id;
    private String name;
    private int age;
    private String city;
    private String contact;

    public Student() {
    }

    public Student(int id, String name, int age, String city, String contact) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
