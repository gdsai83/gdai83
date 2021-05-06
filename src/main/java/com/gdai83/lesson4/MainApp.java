package com.gdai83.lesson4;

import java.util.Random;
import java.util.Scanner;

public class MainApp {

    public static char[][] map;
    public static final int SIZE = 3;
    public static final char MOVE_X = 'X';
    public static final char MOVE_0 = '0';
    public static final char EMPTY = '*';
    public static Scanner move = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        initmap();
        printmap();
        while (true) {
            playerMove();
            printmap();
            if (checkVin(MOVE_X)) {
                System.out.println("Вы победили");
                break;
            }
            if (mapIsFull()) {
                System.out.println("Ничья");
                break;
            }
            playerAi();
            printmap();
            if (checkVin(MOVE_0)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (mapIsFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");

    }

    public static void initmap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j]=EMPTY;
            }
        }
    }

    public static void printmap (){
        System.out.println("  1 2 3");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void playerMove (){
        int x, y;
        do {
            System.out.println("Введите координаты X - и Y-");
            x = move.nextInt() - 1;
            y = move.nextInt() - 1;
        } while (!isMoveValid(x,y));
        map[y][x]=MOVE_X;
    }

    public static void playerAi () {
        int x, y;
        do {
            System.out.println("Введите координаты X - и Y-");
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isMoveValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = MOVE_0;
    }

    public static boolean isMoveValid(int x, int y){
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == EMPTY) {
            return true;
        }
        return false;
    }

    public static boolean checkVin (char cell){
        //Здезь я запутался :)

        int count =0, count1=0, count2=0;

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j] == cell) count++; else count=0;
            }
            if (count==3) return true;
            for (int j = 0; j < SIZE; j++) {
                if(map[j][i] == cell) count1++; else count1=0;
            }
            if (count1==3) return true;
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j] == cell & i==j) count2++; else count2=0;
            }
            if (count2==3) return true;
        }
        return false;
    }

    public static boolean mapIsFull (){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


}
