package com.senla.task9;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Oleg ");
        person.putClothes(true);
        person.putShoes(true);
        person.putJacket(true);
        person.takeUmbrella(true);
        String text = null;

        try {
            Person.walk();
        } catch (PersonIsNotException e) {
            System.out.println(e.getMessage());
            System.out.println("Проверяем что " + person.getName() + " надел : " + "\r\n Одежду  надел ? " + person.isClothesPutOn() + "\r\n Обувь надел ? " + person.isShoesPutOn() + "\r\n Шапку надел ? " + person.isHatPutOn() + "\r\n Куртку надел ? " + person.isJacketPutOn());
            e.printStackTrace();

        } finally {

            try {
                Person.take();

            } catch (PersonTakeNotException e) {
                System.out.println(e.getMessage());
                System.out.println("Проверяем , что " + person.getName() + " взял с собой : " + "\r\n зонтик взял ? " + person.isUmbrellaTake() + "\r\n Сумку взял ? " + person.isBagTake());
                e.printStackTrace();
            }

        }
    }


}


















