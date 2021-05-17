package com.gdai83.lesson7;

public class Cat {
    private String name;
    private int appetit;
    private boolean hungry;

    public int getAppetit() {
        return appetit;
    }


    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean isHungry() {
        return hungry;
    }

    public String getName() {
        return name;
    }

    public Cat(String name){
        this.name = name;
        this.appetit = 5;
        this.hungry = true;
    }

    public void eat(Plate plate){
        if (!plate.decreaseFood(appetit)) {
            hungry = false;
            System.out.println(name+" - поел.");
        } else {
            hungry = true;
            System.out.println(name+" - не поел, не достаточно еды в тарелке!!");
        }
    }
}
