package ru.geekbrains.lesson5;

import java.sql.SQLOutput;
import java.util.Arrays;

public class HomeWork5 {
    static final int SIZE = 10_000_000;
    static final int THREAD_COUNT = 2;

    static void calculate (float[] arr, int shift) {
        for (int i = 0; i < arr.length; i++) {
            int ix = i + shift;
            arr [i] = (float) (arr[i]*Math.sin(0.2f + ix/5) * Math.cos(0.2f+ix/5) * Math.cos(0.4f+ix/2));
        }
    }
    static class CalculateRunnable implements Runnable {
        private final float[] arr;
        private final int shift;

        public CalculateRunnable(float[] arr, int shift) {
            this.arr = arr;
            this.shift = shift;
        }
        @Override
        public void run () { calculate(arr,shift); }
    }

    public static void main(String[] args) throws InterruptedException {
        float[] data = new float[SIZE];
        Arrays.fill(data,1.0f);

        long timeStart;
        timeStart = System.currentTimeMillis();

        calculate(data,0);
        System.out.printf("One execution time %d%n", System.currentTimeMillis() - timeStart);
        int partSize = SIZE/THREAD_COUNT;
        float [][] parts = new float[THREAD_COUNT][partSize];

        timeStart = System.currentTimeMillis();

        for (int i = 0; i < THREAD_COUNT; i++) {
            System.arraycopy(data,partSize*1,parts[i],0,partSize);

        }
        Thread[] threads = new Thread[THREAD_COUNT];
        for (int i=0; i<THREAD_COUNT; i++) {
            threads[i] = new Thread(new CalculateRunnable(parts[i], partSize * i));
            threads[i].start();
        }

        for (int i=0; i<THREAD_COUNT; i++) {
            threads[i].join();
        }

        for (int i=0; i<THREAD_COUNT; i++) {
            System.arraycopy(parts[i], 0, data, partSize * i, partSize);
        }

        System.out.printf("%d thread execution time %d%n", THREAD_COUNT, System.currentTimeMillis() - timeStart);

    }
}
