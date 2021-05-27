package com.gdai83.java2.lesson1;

public class MainApp {
    public static void main(String[] args) {
        ActionsMember actionsMembers[] = {
                new Cat("Барсик", 100, 50),
                new Human("Боб", 1000, 100),
                new Robot("Pentium", 400, 20)
        };

        Obstacles obstacles[] = {
                new Wall(50),
                new Treadmill(100),
                new Wall(100),
                new Treadmill(500)
        };

        for (int j = 0; j < actionsMembers.length; j++) {
            for (int i = 0; i < obstacles.length; i++) {
                obstacles[i].Cross(actionsMembers[j]);
            }
        }


    }
}
