package com.gdsai83.lesson5;

public class MainApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan","ivanovi@mail.ru",9150365858L,30000,41);
        employees[1] = new Employee("Siorov Petr","sidorov@mail.ru",9154215687L,45000,44);
        employees[2] = new Employee("Petrov Maksim","petrov@mail.ru",9151542368L,41000,31);
        employees[3] = new Employee("Makarov Mihail","makarov@mail.ru",91895421148L,30000,29);
        employees[4] = new Employee("Shishkin Dmitriy","shishkin@mail.ru",9185219874L,28000,50);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge()>40){
                employees[i].info();
            }
        }
    }
}
