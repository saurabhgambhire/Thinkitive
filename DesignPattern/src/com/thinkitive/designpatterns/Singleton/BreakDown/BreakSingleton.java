package com.thinkitive.designpatterns.Singleton.BreakDown;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.thinkitive.designpatterns.Singleton.Singleton;

public class BreakSingleton {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Singleton singleton = Singleton.getObject();
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton2 = constructor.newInstance();
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
