package com.thinkitive.designpatterns;

public class Singleton {
    // constructor private

    private static Singleton singleton = null;

    private Singleton(){
    }

    public static Singleton getObject(){
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }
}
