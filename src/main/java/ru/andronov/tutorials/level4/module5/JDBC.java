package ru.andronov.tutorials.level4.module5;

import java.sql.SQLException;

public class JDBC {

    public static String URL = "jdbc:postgresql://localhost:5432/crm-build-comfort";
    public static String USER = "postgres";
    public static String password = "postgres";

    public static void main(String[] args) throws SQLException {
        UserDAO dao = new UserDAOImpl();
        new Thread(() -> run(() -> dao.printProductNameById(1))).start();
        new Thread(() -> run(() -> dao.printProductNameById(2))).start();
        new Thread(() -> run(() -> dao.printProductNameById(3))).start();
        new Thread(() -> run(() -> dao.printProductNameById(4))).start();
    }

    public static int run(IntProducer producer) {
        try {
            return producer.produce();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
