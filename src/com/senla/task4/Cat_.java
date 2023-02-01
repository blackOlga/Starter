package com.senla.task4;

import java.util.Random;
public class Cat_ {

    String[] arrayCats = new String[10];
    int[] arrayAgeCats = new int[10];


     Random random = new Random();





    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Cat_(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}





























