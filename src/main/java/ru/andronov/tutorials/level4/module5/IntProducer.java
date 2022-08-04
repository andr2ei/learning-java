package ru.andronov.tutorials.level4.module5;

import java.sql.SQLException;

@FunctionalInterface
public interface IntProducer {
    int produce() throws SQLException;
}
