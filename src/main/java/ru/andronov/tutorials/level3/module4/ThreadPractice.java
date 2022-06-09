package ru.andronov.tutorials.level3.module4;

public class ThreadPractice {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.print(i);
            }
        });
        thread.start();
        thread.join();
        System.out.println(thread.getName() + "thread completed");

        ExtendedThread thread1 = new ExtendedThread("Y", 2000);
        ExtendedThread thread2 = new ExtendedThread("X", 1000);

        System.out.println("Starting threads 1 and 2");
        thread1.start();
        thread2.start();
        System.out.println("Ending threads 1 and 2");
    }

}
