package ru.andronov.tutorials.level3.module4.monitor;

public class MonitorPractice {

    public static void main(String[] args) {

        Monitor monitor = new Monitor();
        Thread thread1 = new Thread(new MonitorRunnable(monitor));
        Thread thread2 = new Thread(new MonitorRunnable(monitor));
        Thread thread3 = new Thread(new MonitorRunnable(monitor));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
