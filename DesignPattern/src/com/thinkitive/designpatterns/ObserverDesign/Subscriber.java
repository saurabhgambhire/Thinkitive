package com.thinkitive.designpatterns.ObserverDesign;

public class Subscriber implements User{

    private String name;

    Subscriber(String name){
        this.name = name;
    }

    @Override
    public void notified() {
        System.out.println(name +": New Video has been uploaded ");
    }
    
}
