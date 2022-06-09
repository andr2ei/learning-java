package ru.andronov.tutorials.level3.module4.monitor;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

public class Monitor {

    @SneakyThrows
    public synchronized void syncMethodWithWait() {
        String name = Thread.currentThread().getName();
        System.out.println("Start syncMethod " + name);
        this.wait(3000);
        System.out.println("End syncMethod " + name);
    }

    @SneakyThrows
    public synchronized void syncMethodWithSleep() {
        String name = Thread.currentThread().getName();
        System.out.println("Start syncMethod " + name);
        Thread.sleep(3000);
        System.out.println("End syncMethod " + name);
    }
}
