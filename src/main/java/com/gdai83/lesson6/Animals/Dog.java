package com.gdai83.lesson6.Animals;

public class Dog extends Animal{
    private static int counter;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
        runLimits = 500;
        swimLimits = 10;
        counter++;
        setCount(getCount()+1);
    }

    public static int getCounter() {
        return counter;
    }
}
