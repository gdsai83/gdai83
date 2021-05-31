package com.gdai83.java2.lesson2;

public class MainApp {

    public static void main(String[] args) {
        String[][] arr = new String[][] {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"},
        };

        String[][] arr1 = new String[][] {
            {"1", "2", "3"},
            {"1", "2", "3"},
            {"1", "2", "3"},
        };

        String[][] arr2 = new String[][] {
                {"1", "2", "3", "4"},
                {"5", "F", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
        };

        try {
            summArray(arr);
            summArray(arr1);
            summArray(arr2);
        } catch (MyArrayDataException e) {
            System.out.println(e.toString());
        }
    }

    public static void summArray(String[][] array) throws MyArrayDataException {
        try {
            if (array.length != 4 && array[0].length != 4) {
                throw new MyArraySizeException();
            } else {
                int summ = 0;
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        try {
                            summ += Integer.parseInt(array[i][j]);
                        } catch (NumberFormatException e) {
                            throw new MyArrayDataException(i, j);
                        }
                    }
                }
                System.out.println("Сумма значений массива составляет - " + summ);
            }
        } catch (MyArraySizeException e) {
            System.out.println(e.toString());
        }
    }
}
