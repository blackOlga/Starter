package com.senla.task9;

public class Person {

    static String name;
    static boolean isClothesPutOn;
    static boolean isShoesPutOn;
    static boolean isHatPutOn;
    static boolean isJacketPutOn;
    static boolean isUmbrellaTake;
    static boolean isBagTake;


   protected static void walk() throws PersonIsNotException {

        if (isClothesPutOn && isShoesPutOn && isHatPutOn && isJacketPutOn) {
            System.out.println(name + "одевается на прогулку");
            System.out.println(name + " выходит из дома!");
        } else {

            throw new PersonIsNotException(name + " не  оделся!");
        }

    }

    protected static void take() throws PersonTakeNotException {

        if (isUmbrellaTake && isBagTake) {
            System.out.println(name + "берёт с собой на прогулку");
        } else {
            throw new PersonTakeNotException(name + " что-то забыл взять !");
        }
    }

    public Person(String name) {
        Person.name = name;
    }

       public void putClothes(boolean isClothesPutOn) {
        System.out.println("одежда одета");
        Person.isClothesPutOn = true;
    }

    public void putShoes(boolean isShoesPutOn) {
        System.out.println("обувь одета");
        Person.isShoesPutOn = true;
    }

    public void hatPut(boolean isHatPutOn) {
        System.out.println("шапка одета");
        Person.isHatPutOn = true;
    }

    public void putJacket(boolean isJacketPutOn) {
        System.out.println("курка одета");
        Person.isJacketPutOn = true;
    }


    public void takeUmbrella(boolean isUmbrellaTake) {
        System.out.println(name + " зонтик взял");
        Person.isUmbrellaTake = true;
    }

    public void takeBag(boolean isBagTake) {
        System.out.println(name + "сумку взял");
        Person.isBagTake = true;
    }


    public String getName() {
        return name;
    }

    public boolean isClothesPutOn() {
        return isClothesPutOn;
    }


    public boolean isShoesPutOn() {
        return isShoesPutOn;
    }

    public boolean isHatPutOn() {
        return isHatPutOn;
    }

    public boolean isJacketPutOn() {
        return isJacketPutOn;
    }

    public boolean isBagTake() {
        return isBagTake;
    }

    public boolean isUmbrellaTake() {
        return isUmbrellaTake;
    }
}

