package com.gdai83.lesson6.Animals;

public abstract class Animal {

    String name;
    int age;
    int runLimits;
    int swimLimits;
    private static int count;

    public void run(int distance){
        if (distance <= runLimits) {
            System.out.println(name + " пробежал(-ла): " + distance +" м.");
        } else {
            System.out.println(name + " пробежал(-ла): " + runLimits +" м.");
        }
    }

    public void swim(int distance){
        if (distance <= swimLimits){
            System.out.println(name + " проплыл(-ла): " + distance +" м.");
        } else{
            System.out.println(name + " проплыл(-ла): " + swimLimits +" м.");
    }
    }

    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Animal.count = count;
    }
}
