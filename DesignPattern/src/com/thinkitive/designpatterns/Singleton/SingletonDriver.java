package com.thinkitive.designpatterns.Singleton;

public class SingletonDriver {
    public static void main(String[] args) {
        
        Singleton singleton = Singleton.getObject();

        System.out.println(singleton.hashCode());
        System.out.println(Singleton.getObject().hashCode());
        System.out.println(Singleton.getObject());
    }
    
}
