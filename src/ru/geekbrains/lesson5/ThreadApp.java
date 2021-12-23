package ru.geekbrains.lesson5;

public class ThreadApp {
    public static void main(String[] args) {
        System.out.printf("Основной поток ThreadID %d!!!%n", Thread.currentThread().getId());

        new Thread() { //поточный метод в java
            @Override
            public void run() {
                System.out.printf("Привет из ноового потока ThreadID %d!!!%n", Thread.currentThread().getId());
            }
        }.start();
    }
}
