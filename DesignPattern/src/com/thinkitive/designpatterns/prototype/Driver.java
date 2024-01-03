package com.thinkitive.designpatterns.prototype;

import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        Connection connection = new Connection();
        connection.setConnection(12345);
        List<String> list = Arrays.asList("saurabh", "gambhire", "thinkitive");
        connection.setImportantData();
        connection.setDomains(list);
        System.out.println(connection);
        Connection connection2 = (Connection) connection.clone();
        System.out.println(connection2);

    }
    
}
