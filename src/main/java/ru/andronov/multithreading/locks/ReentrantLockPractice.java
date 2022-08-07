package ru.andronov.multithreading.locks;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockPractice {

    private final ReentrantLock reentrantLock = new ReentrantLock(true);

    public static void main(String[] args) {
        var reentrantLockPractice = new ReentrantLockPractice();
        for (int i = 0; i < 10; i++) {
            final int j = i;
            new Thread(() -> extracted(reentrantLockPractice, "in lock " + j)).start();
        }
    }

    private static void extracted(ReentrantLockPractice reentrantLockPractice, String msg) {
        try {
            reentrantLockPractice.reentrantLock.lock();
            System.out.println(msg);
            Thread.sleep(1000);
            reentrantLockPractice.reentrantLock.unlock();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
