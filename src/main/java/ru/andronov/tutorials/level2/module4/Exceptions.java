package ru.andronov.tutorials.level2.module4;

public class Exceptions {

    public static void main(String[] args) {

        try {
            Person person = new Person("name1", 160);
            System.out.println("person = " + person);
        } catch (AgeException ae) {
            ae.printStackTrace(System.out);
        } finally {
            System.out.println("Finally finished");
        }

    }
}
