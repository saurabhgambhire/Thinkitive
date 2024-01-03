package com.thinkitive.designpatterns.prototype;

public class Driver {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        Connection connection = new Connection();
        connection.setConnection(12345);
        connection.setImportantData();
        System.out.println(connection);

        Connection connection2 = (Connection) connection.clone();

        System.out.println(connection2);

    }
    
}
