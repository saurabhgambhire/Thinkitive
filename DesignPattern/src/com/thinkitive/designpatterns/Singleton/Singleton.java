package com.thinkitive.designpatterns.Singleton;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton(){
    }

    public static Singleton getObject(){
        if (singleton == null) {
            synchronized(Singleton.class){
                singleton = new Singleton();
            }
        }

        return singleton;
    }
}
