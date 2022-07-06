package ru.andronov.patterns.creational.factorymethod;

public interface ICar {

    default String signal() {
        return "Faaa Faaa";
    }

}
