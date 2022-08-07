package ru.andronov.multithreading.executors;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsPractice {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        var futures = new ArrayList<Future<String>>();

        Future<String> stringFuture1 = executorService.submit(() -> {
            System.out.println("In executor 1");
            Thread.sleep(2000);
            return "Result 1";
        });
        Future<String> stringFuture2 = executorService.submit(() -> {
            System.out.println("In executor 2");
            Thread.sleep(2000);
            return "Result 2";
        });
        Future<String> stringFuture3 = executorService.submit(() -> {
            System.out.println("In executor 3");
            Thread.sleep(2000);
            return "Result 3";
        });

        futures.add(stringFuture1);
        futures.add(stringFuture2);
        futures.add(stringFuture3);

        futures.forEach(f -> {
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
