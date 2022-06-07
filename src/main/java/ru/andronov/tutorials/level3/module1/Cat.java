package ru.andronov.tutorials.level3.module1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cat {
    private final String name;
    private int age;
}
