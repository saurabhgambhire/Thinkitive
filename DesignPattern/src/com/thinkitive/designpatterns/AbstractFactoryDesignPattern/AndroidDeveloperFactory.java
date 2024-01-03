package com.thinkitive.designpatterns.AbstractFactoryDesignPattern;

public class AndroidDeveloperFactory extends AbstractEmployeeFactory {


    @Override
    public Employee creatEmployee() {
        return new AndroidDeveloper();
    }
}
