package ru.andronov.tutorials.level4.module5;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBCP {

    private static BasicDataSource ds = new BasicDataSource();

    static {
        ds.setUrl(JDBC.URL);
        ds.setUsername(JDBC.USER);
        ds.setPassword(JDBC.password);
        ds.setMinIdle(1);
        ds.setMaxIdle(2);
        ds.setMaxTotal(2);
        ds.setMaxOpenPreparedStatements(100);
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    private DBCP() {}
}
