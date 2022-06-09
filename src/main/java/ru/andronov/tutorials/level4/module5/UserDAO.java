package ru.andronov.tutorials.level4.module5;

import java.sql.SQLException;

interface UserDAO {

    int printProductNameById(Integer id) throws SQLException;

}
