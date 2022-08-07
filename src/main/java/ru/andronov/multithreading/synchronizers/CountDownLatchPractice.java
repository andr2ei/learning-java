package ru.andronov.multithreading.synchronizers;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchPractice {
    private final CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) {
        var countDownLatchPractice = new CountDownLatchPractice();
        new Thread(() -> extracted(countDownLatchPractice)).start();
        new Thread(() -> extracted(countDownLatchPractice)).start();

        new Thread(() -> extracted2(countDownLatchPractice)).start();
        new Thread(() -> extracted2(countDownLatchPractice)).start();
    }

    private static void extracted(CountDownLatchPractice countDownLatchPractice) {
        try {
            countDownLatchPractice.countDownLatch.await();
            System.out.println("Completed waiting for latch");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void extracted2(CountDownLatchPractice countDownLatchPractice) {
        System.out.println("Counting down latch");
        countDownLatchPractice.countDownLatch.countDown();

    }
}
