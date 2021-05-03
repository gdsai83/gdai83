package com.gdai83.lesson3;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        int[] arr = {0,1,1,0,0,1,1,1,0,0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1) {
                arr[i]=0;
            } else arr[i]=1;
        }

        int[] arr100 = new int[100];
        for (int j = 0; j < arr100.length; j++) {
            arr100[j]=j+1;
        }

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]<6) {
                arr2[i]*=2;
            }
        }
        
        int[][] arr3 = new int[10][10];
        for (int j = 0; j < arr3.length; j++) {
            for (int i = 0; i < arr3[j].length; i++) {
                if (i==j | i==arr3[j].length-1-j) {
                    arr3[j][i]=1;
                } else arr3[j][i]=0;
            }
        }

        int[] arr5 = {4,3,2,6,12,4,-5,0,4,5};
        int min = 0, max = 0;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i]<=min) min = arr5[i];
            if (arr5[i]>=max) max = arr5[i];
        }

    }

}
