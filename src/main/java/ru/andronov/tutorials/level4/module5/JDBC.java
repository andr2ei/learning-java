package ru.andronov.tutorials.level4.module5;

import java.sql.SQLException;

public class JDBC {

    public static String URL = "jdbc:MySql://localhost:3306/learning?serverTimezone=UTC";
    public static String USER = "root";
    public static String password = "";

    public static void main(String[] args) throws SQLException {
        UserDAO dao = new UserDAOImpl();
        dao.printProductNameById(1);
    }

}
