package com.thinkitive.designpatterns.prototype;

import java.util.List;

public class Connection implements Cloneable {
    private int connection;
    private List<String> domains;

    Connection() {

    }

    public int getConnection() {
        return connection;
    }

    public void setConnection(final int connection) {
        this.connection = connection;
    }

    public void setImportantData() throws InterruptedException {
        System.out.println("Loading Important Data");
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return "Connection [connection=" + connection + "]";
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // deep cloning 
        Connection connection = new Connection();
        connection.setConnection(this.getConnection());
        for (String domain : this.getDomains()) {
            connection.getDomains().add(domain);
        }
        return super.clone();
    }
}
