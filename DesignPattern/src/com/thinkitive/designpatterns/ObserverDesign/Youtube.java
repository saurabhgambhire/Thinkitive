package com.thinkitive.designpatterns.ObserverDesign;

public interface Youtube {

    void subscribe(User user);
    void unSubscribe(User user);
    void notifyChanges();
    
}
