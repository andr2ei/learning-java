package ru.andronov.patterns.creational.factorymethod;

public class CarFactory implements ICarFactory {
    @Override
    public ICar create() {
        return new Car();
    }
}
