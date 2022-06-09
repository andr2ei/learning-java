package ru.andronov.tutorials.level3.module3;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class Man implements Serializable {
    private String name;
    private int age;
}
