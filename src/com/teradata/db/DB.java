package com.teradata.db;

public class DB extends DataBaseUtil{
    @Override
    protected String getUser() {
        return "root";
    }

    @Override
    protected String getDatabaseName() {
        return "apicloud";
    }

    @Override
    protected String getUrl() {
        return "jdbc:mysql://10.73.134.229:3306/apicloud?characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT%2B8";
    }

    @Override
    protected Integer getPort() {
        return 3306;
    }
    @Override
    protected String getIp() {
        return "10.73.134.229";
    }


    @Override
    protected String getPassword() {
        return "sdfa@eWs127";
    }
}
