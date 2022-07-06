package ru.andronov.patterns.creational.builder;

public class CarClient {

    public static void main(String[] args) {
        Car car = Car.builder()
                .setAge(10)
                .setColor("Blue")
                .setPower("120")
                .build();
        System.out.println("car = " + car);
    }
}
