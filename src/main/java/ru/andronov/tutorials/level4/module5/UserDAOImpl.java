package ru.andronov.tutorials.level4.module5;

import java.sql.*;

public class UserDAOImpl implements UserDAO {

    @Override
    public int printProductNameById(Integer id) throws SQLException {
        try(Connection con = DBCP.getConnection()){
            String sql = "SELECT * FROM products WHERE product_id = ?";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                st.setInt(1, id);
                try (ResultSet resultSet = st.executeQuery()) {
                    while (resultSet.next()) {
                        System.out.println("resultSet.getString(\"product_name\") = " + resultSet.getString("product_name"));
                    }
                }
            }
        }
        return 0;
    }
}
