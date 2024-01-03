package com.thinkitive.designpatterns.ObserverDesign;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannle implements Youtube{
    List<User> subScribers = new ArrayList<>();

    @Override
    public void subscribe(User user) {
        subScribers.add(user);
    }

    @Override
    public void unSubscribe(User user) {
        subScribers.remove(user);
    }

    @Override
    public void notifyChanges() {
        for (User subScribers : subScribers) {
            subScribers.notified();
        }
    }    


}
