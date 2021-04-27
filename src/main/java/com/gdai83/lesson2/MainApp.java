package com.gdai83.lesson2;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(checkSum(12,7));
        checkPositive(0);
        System.out.println(checkNegative(-4));
        printStrings("Hello",2);
        System.out.println(leapYear(2000));
    }

    public static boolean checkSum (int a, int b) {
        if (a+b > 10 && a+b <=20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkPositive(int a){
        if (a >=0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    public static boolean checkNegative(int a){
        if (a >=0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printStrings(String str, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean leapYear(int year){
        if (year%4==0) {
            if (year % 400 == 0) {
                return true;
            } else if (year % 100 == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

}
