package com.gdai83.java2.lesson2;

public class MyArrayDataException extends RuntimeException{
    private int i,j;
    public MyArrayDataException(int i, int j) {
        this.i=i+1;
        this.j=j+1;
    }

    public String toString(){
        return "Не удалось преобразовать элемент массива в ячейке - ["+i+"]["+j+"]";
    }
}
