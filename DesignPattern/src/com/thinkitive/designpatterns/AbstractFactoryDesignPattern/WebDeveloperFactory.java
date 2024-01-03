package com.thinkitive.designpatterns.AbstractFactoryDesignPattern;

public class WebDeveloperFactory extends AbstractEmployeeFactory {

    @Override
    public Employee creatEmployee() {
        return new WebDeveloper();
    }

}
