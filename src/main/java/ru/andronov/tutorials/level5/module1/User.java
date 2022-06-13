package ru.andronov.tutorials.level5.module1;

import lombok.AllArgsConstructor;
import lombok.ToString;

@MyAnnotation(message = "Hi there", flag = true)
@AllArgsConstructor
@ToString
public class User {

    private final String name;
    private int age;

    public String getName() {
        return name;
    }

}
