package com.gdsai83.lesson5;

public class Employee {

    private String fio;
    private String email;
    private long phone;
    private int wages;
    private int age;

    public Employee(String fio, String email, long phone, int wages, int age){
        this.fio=fio;
        this.email=email;
        this.phone=phone;
        this.wages=wages;
        this.age=age;
    }

    public void info(){
        System.out.println(fio+", "+email+", "+phone+", "+wages+", "+age);
    }

    public int getAge() {
        return age;
    }
}
