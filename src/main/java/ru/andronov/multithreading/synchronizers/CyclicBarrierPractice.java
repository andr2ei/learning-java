package ru.andronov.multithreading.synchronizers;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierPractice {
    private final CyclicBarrier cyclicBarrier = new CyclicBarrier(2);

    public static void main(String[] args) {
        var cyclicBarrierPractice = new CyclicBarrierPractice();

        new Thread(() -> extracted(cyclicBarrierPractice)).start();
        new Thread(() -> extracted(cyclicBarrierPractice)).start();

    }

    private static void extracted(CyclicBarrierPractice cyclicBarrierPractice) {
        try {
            System.out.println("waiting for cyclic barrier");
            cyclicBarrierPractice.cyclicBarrier.await();
            System.out.println("waiting completed");
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}
