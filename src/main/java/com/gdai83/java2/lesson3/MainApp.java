package com.gdai83.java2.lesson3;

import java.util.ArrayList;
import java.util.HashSet;

public class MainApp {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Aльфa");
        list.add("Бета");
        list.add("Aльфa");
        list.add("Этa");
        list.add("Гaммa");
        list.add("Эпсилон");
        list.add("Oмeгa");
        list.add("Гaммa");
        list.add("Гaммa");
        list.add("Эпсилон");
        list.add("Oмeгa");

        System.out.println(list);

        HashSet<String> set = new HashSet<>(list);

        System.out.println(set);

        for (String s : set) {
            int count = 0;
            for (String value : list) {
                if (s.equals(value)) {
                    count++;
                }
            }
            System.out.println(s + " - повторяется " + count + " раз.");
        }
        Phonebook.add("Ivanov", "79744444444");
        Phonebook.add("Petrov", "79785555555");
        Phonebook.add("Ivanov", "79786666666");
        Phonebook.add("Sidorov", "79788888888");
        Phonebook.add("Ivanov", "797822222222");
        Phonebook.get("Ivanov");


    }
}
