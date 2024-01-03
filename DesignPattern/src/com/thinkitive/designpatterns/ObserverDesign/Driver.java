package com.thinkitive.designpatterns.ObserverDesign;

public class Driver {
    public static void main(String[] args) {
        YoutubeChannle channle = new YoutubeChannle();
        Subscriber saurabh = new Subscriber("Saurabh");      
        Subscriber vijyesh = new Subscriber("vijyesh");
        Subscriber harshal = new Subscriber("harshal");
        Subscriber parishkit = new Subscriber("parishkit");

        channle.subscribe(saurabh);
        channle.subscribe(parishkit);
        channle.subscribe(vijyesh);
        channle.subscribe(harshal);

        channle.notifyChanges();

        System.out.println(" ------------------------------------------- ");

        channle.unSubscribe(parishkit);

        channle.notifyChanges();
    }
}
