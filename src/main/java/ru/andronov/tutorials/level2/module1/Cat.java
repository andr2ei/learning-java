package ru.andronov.tutorials.level2.module1;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class Cat {
    private String name;
    private int age;
    private boolean isLazy;

//    public Cat(String name, int age, boolean isLazy) {
//        this.name = name;
//        this.age = age;
//        this.isLazy = isLazy;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && isLazy == cat.isLazy && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isLazy);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isLazy=" + isLazy +
                '}';
    }
}
