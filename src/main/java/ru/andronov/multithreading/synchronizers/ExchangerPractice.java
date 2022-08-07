package ru.andronov.multithreading.synchronizers;

import java.util.concurrent.Exchanger;

public class ExchangerPractice {

    private final Exchanger<String> exchanger = new Exchanger<>();

    public static void main(String[] args) {
        var exchangerPractice = new ExchangerPractice();
        new Thread(() -> extracted(exchangerPractice, "Exchangeable str 1")).start();
        new Thread(() -> extracted(exchangerPractice, "Exchangeable str 2")).start();
    }

    private static void extracted(ExchangerPractice exchangerPractice, String x) {
        try {
            String exchangeableStr = exchangerPractice.exchanger.exchange(x);
            System.out.println(exchangeableStr);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
