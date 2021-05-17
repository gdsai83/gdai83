package com.gdai83.lesson7;

public class Plate {
    private  int food;

    public Plate(int food){
        this.food = food;
    }


    public boolean decreaseFood (int amount){
        if (amount <= food) {
            food-= amount;
            return false;
        } else {
            return true;
        }
    }

   public void info(){
        System.out.printf("Plate [ Food: %d ]\n", food);
   }

   public void addEat(){
        food=50;
   }
}
