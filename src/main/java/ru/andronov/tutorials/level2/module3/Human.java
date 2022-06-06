package ru.andronov.tutorials.level2.module3;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Human implements Comparable<Human>, Cloneable{
    private String firstName;
    private String lastName;
    private int age;

    @Override
    public int compareTo(Human another) {
        int lastNameComparison = lastName.compareTo(another.getLastName());
        if (lastNameComparison != 0) return lastNameComparison;
        int firstNameComparison = firstName.compareTo(another.getFirstName());
        if (firstNameComparison != 0) return firstNameComparison;
        return Integer.compare(age, another.getAge());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
