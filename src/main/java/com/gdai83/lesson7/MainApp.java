package com.gdai83.lesson7;

public class MainApp {

    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik");
        cats[1] = new Cat("Murzik");
        cats[2] = new Cat("Tomas");
        cats[3] = new Cat("Pushok");
        cats[4] = new Cat("Tishka");

        Plate plate = new Plate(10);
        plate.info();

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        System.out.println();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].isHungry()) {
                System.out.println(cats[i].getName()+" - голоден");
            } else {
                System.out.println(cats[i].getName()+" - сыт");
            }
        }

        plate.info();

    }

}
