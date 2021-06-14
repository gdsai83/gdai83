package com.gdai83.java2.lesson5;


public class HomeWork5 {
    public static void main(String[] args) throws InterruptedException {

        calculateTheValue();

        splitIntoTwoStreams();

    }

    public static void calculateTheValue() {
        float[] arr = new float[10000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) 1;
        }

        long a = System.currentTimeMillis();
        for (
                int i = 0;
                i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Подсчет целого массива - " + (System.currentTimeMillis() - a));
    }

    public static void splitIntoTwoStreams() throws InterruptedException {
        float[] arr = new float[10000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) 1;
        }

        float[] a1 = new float[arr.length];
        float[] a2 = new float[arr.length];
        long b = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, arr.length / 2);
        System.arraycopy(arr, arr.length / 2, a2, 0, arr.length / 2);
        System.out.println("Разбивка на 2 - " + (System.currentTimeMillis() - b));

        Thread thread1 = new Thread(() -> {
            long c = System.currentTimeMillis();
            for (int i = 0; i < a1.length; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.out.println("Подсчет 1 половины - " + (System.currentTimeMillis() - c));
        });

        Thread thread2 = new Thread(() -> {
            long d = System.currentTimeMillis();
            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.out.println("Подсчет 2 половины - " + (System.currentTimeMillis() - d));
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        long e = System.currentTimeMillis();
        System.arraycopy(a1, 0, arr, 0, arr.length / 2);
        System.arraycopy(a2, 0, arr, arr.length / 2, arr.length / 2);
        System.out.println("Склейка 2-х массивов - " + (System.currentTimeMillis() - e));

    }

}
