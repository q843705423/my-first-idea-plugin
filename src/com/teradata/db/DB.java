package com.teradata.db;

public class DB extends DataBaseUtil{
    @Override
    protected String getUser() {
        return "root";
    }

    @Override
    protected String getDatabaseName() {
        return "blog";
    }

    @Override
    protected String getPassword() {
        return "root";
    }

    @Override
    protected String getIp() {
        return "127.0.0.1";
    }

    @Override
    protected Integer getPort() {
        return 3306;
    }
}
