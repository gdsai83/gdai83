package com.gdai83.lesson1;

public class MainApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Aplle");
    }

    public static void checkSumSign(){
        int a = 10,b = 5;
        if ((a+b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 23, b = 11;
        if (a >= b){
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }
}
