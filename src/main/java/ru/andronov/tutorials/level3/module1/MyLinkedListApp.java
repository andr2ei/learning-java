package ru.andronov.tutorials.level3.module1;

public class MyLinkedListApp {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(new Cat("name1", 10));
        list.add(new Cat("name1", 11));
        list.add(new Cat("name1", 12));
        list.add(new Cat("name1", 13));
        list.add(new Cat("name1", 14));
        System.out.println("list.toString() = " + list.toString());

        list.remove(new Cat("name1", 11));
        System.out.println("after remove list.toString() = " + list.toString());

        Object retrieved = list.get(1);
        System.out.println("retrieved = " + retrieved);

        list.remove(new Cat("name1", 10));
        list.remove(new Cat("name1", 14));
        list.remove(new Cat("name1", 12));
        list.remove(new Cat("name1", 13));
        System.out.println("after total remove list.toString() = " + list.toString());
        System.out.println("list.size() = " + list.size());

    }
}
