package ru.andronov.tutorials.level2.module5;

public class StoreApp {
    public static void main(String[] args) {
        StoreService storeService = new StoreServiceImpl();
        storeService.start();
    }
}
