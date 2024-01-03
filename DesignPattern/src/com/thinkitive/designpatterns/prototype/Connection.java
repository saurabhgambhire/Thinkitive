package com.thinkitive.designpatterns.prototype;

public class Connection implements Cloneable{
    private int connection;

    Connection(){

    }

    public int getConnection() {
        return connection;
    }

    public void setConnection(final int connection) {
        this.connection = connection;
    }

    public void setImportantData() throws InterruptedException{
        System.out.println("Loading Important Data");
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return "Connection [connection=" + connection + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    

    
    
}
