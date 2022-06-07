package ru.andronov.tutorials.level3.module1;

public class MyArrayListApp {

    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();
        list.add(new Cat("name1", 10));
        list.add(new Cat("name1", 11));
        list.add(new Cat("name1", 12));
        list.add(new Cat("name1", 13));
        list.add(new Cat("name1", 14));
        System.out.println("list.size() = " + list.size());
        System.out.println("list.toString() = " + list);
        System.out.println("list.contains(new Cat(\"name1\", 13)) = " + list.contains(new Cat("name1", 13)));
        System.out.println("list.remove(new Cat(\"name1\", 12)) = " + list.remove(new Cat("name1", 12)));
        System.out.println("list.toString() = " + list);
        list.remove(1);
        System.out.println("list.toString() = " + list);
    }


}
