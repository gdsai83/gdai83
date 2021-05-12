package com.gdai83.lesson6;

import com.gdai83.lesson6.Animals.Animal;
import com.gdai83.lesson6.Animals.Cat;
import com.gdai83.lesson6.Animals.Dog;

public class MainApp {

    public static void main(String[] args) {
        Animal cat1 = new Cat("Васька",10);
        Animal cat2 = new Cat("Барсик",5);
        Animal cat3 = new Cat("Мурка",4);
        Animal dog1 = new Dog("Бобик",7);
        Animal dog2 = new Dog("Тузик",8);

        dog1.swim(3);
        dog2.run(600);

        cat1.run(34);
        cat2.run(400);
        cat3.swim(3);

        System.out.println(Cat.getCounter());
        System.out.println(Dog.getCounter());
        System.out.println(Animal.getCount());
    }
}
