package ru.andronov.patterns.creational.factorymethod;

public class CarClient {

    public static void main(String[] args) {
        ICarFactory carFactory = new CarFactory();
        ICar car = carFactory.create();
        System.out.println("car = " + car.signal());
    }

}
