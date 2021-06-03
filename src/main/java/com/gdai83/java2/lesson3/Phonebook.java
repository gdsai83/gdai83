package com.gdai83.java2.lesson3;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    private static final HashMap<String, String> map = new HashMap<>();


    public static void add(String surname, String tel) {
        map.put(tel, surname);
    }

    public static void get(String surname) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(surname)) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }

}
