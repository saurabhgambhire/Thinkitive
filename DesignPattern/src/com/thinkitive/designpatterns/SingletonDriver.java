package com.thinkitive.designpatterns;

public class SingletonDriver {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getObject();
        System.out.println(singleton);
        System.out.println(Singleton.getObject());
        System.out.println(Singleton.getObject());
    }
    
}
