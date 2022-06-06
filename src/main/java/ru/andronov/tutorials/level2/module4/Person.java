package ru.andronov.tutorials.level2.module4;

import lombok.ToString;

@ToString
public class Person {
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private String name;
    private int age;

    public Person(String name, int age) throws AgeException {
        this.name = name;
        if (age < 0 || age > 150) {
            throw new AgeException("Age is invalid");
        }
        this.age = age;
    }
}
