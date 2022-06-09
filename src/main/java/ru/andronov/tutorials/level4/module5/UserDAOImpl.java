package ru.andronov.tutorials.level4.module5;

import java.sql.*;

public class UserDAOImpl implements UserDAO {

    @Override
    public int printProductNameById(Integer id) throws SQLException {
        try(Connection con = DriverManager.getConnection(JDBC.URL, JDBC.USER, JDBC.password)) {
            String sql = "SELECT * FROM products WHERE id = ?";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                st.setInt(1, id);
                try(ResultSet resultSet = st.executeQuery()) {
                    while (resultSet.next()) {
                        System.out.println("resultSet.getString(\"name\") = " + resultSet.getString("name"));
                    }
                }
            }

        }
        return 0;
    }
}
