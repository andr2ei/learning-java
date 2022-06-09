package ru.andronov.tutorials.level3.module4.monitor;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class MonitorRunnable implements Runnable {

    private final Monitor monitor;

    @SneakyThrows
    @Override
    public void run() {
        monitor.syncMethodWithWait();
        Thread.sleep(3000);
        monitor.syncMethodWithSleep();
    }
}
