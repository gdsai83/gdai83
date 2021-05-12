package com.gdai83.lesson6.Animals;

public class Cat extends Animal{
    private static int counter;

    public Cat (String name, int age){
        this.name = name;
        this.age = age;
        runLimits = 200;
        swimLimits = 0;
        counter++;
        setCount(getCount()+1);
    }

    @Override
    public void swim(int distance){
        System.out.println(name + " не умеет плавать!");
    }

    public static int getCounter() {
        return counter;
    }
}
