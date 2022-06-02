package ru.andronov.tutorials.level2.module1;

public class ObjectPractice {

    public static void main(String[] args) {
        Cat cat1 = new Cat("name1", 10, true);
        Cat cat2 = new Cat("name2", 10, false);
        Cat cat3 = new Cat("name1", 10, true);

        System.out.println("cat1.equals(cat2):" + cat1.equals(cat2));
        System.out.println("cat1.equals(cat3):" + cat1.equals(cat3));
    }
}
