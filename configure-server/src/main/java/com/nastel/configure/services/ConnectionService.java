package com.nastel.configure.services;

public class ConnectionService {
    public String[] getConnections() throws Exception {
        return new String[]{ "1", "2", "3" };
    }

    public String getConnection(String id) throws Exception {
        return id;
    }

    public void createConnection() throws Exception {
    }

    public void updateConnection(String id) throws Exception {
    }

    public void deleteConnection(String id) throws Exception {
    }
}
