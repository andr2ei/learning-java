package ru.andronov.multithreading.synchronizers;

import java.util.concurrent.Semaphore;

public class SemaphorePractice {
    private final Semaphore semaphore = new Semaphore(2);


    public static void main(String[] args) throws InterruptedException {
        var semaphorePractice = new SemaphorePractice();
        new Thread(() -> extracted(semaphorePractice)).start();
        new Thread(() -> extracted(semaphorePractice)).start();
        new Thread(() -> extracted(semaphorePractice)).start();
        new Thread(() -> extracted(semaphorePractice)).start();


    }

    private static void extracted(SemaphorePractice semaphorePractice) {
        try {
            semaphorePractice.semaphore.acquire();
            System.out.println("Acquired semaphore");
            Thread.sleep(5000);
            semaphorePractice.semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
