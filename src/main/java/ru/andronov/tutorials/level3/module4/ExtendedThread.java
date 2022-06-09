package ru.andronov.tutorials.level3.module4;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class ExtendedThread extends Thread {

    private String message;
    private int delay;

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(delay);
            System.out.print(message);
        }
    }
}
