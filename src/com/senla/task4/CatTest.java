package com.senla.task4;


public class CatTest {


    public static void menu() {
        String[] arrayCats = new String[]
                {"Бант", "Даша", "Пушок", "Айда", "Барсик", "Лорд", "Тишка", "Тоша", "Дружок", "Мурка"};
        int length = arrayCats.length;
        int ran = (int) Math.floor(Math.random() * length);
        int age = (int) Math.floor(Math.random() * 28);
        String phrase = arrayCats[ran] + " " + age;
         int i = 4;
        do {
            System.out.println("Имя и возраст котёнка : " + phrase);
        }while ( i > 5);
    }


    static void Start() {
        String[] arrayCats = new String[]
                {"Бант", "Даша", "Пушок", "Айда", "Барсик", "Лорд", "Тишка", "Тоша", "Дружок", "Мурка"};

        int length = arrayCats.length;
        int ran = (int) Math.floor(Math.random() * length);
        int age = (int) Math.floor(Math.random() * 28);

            String phrase = arrayCats[ran] + " " + age;
            int i = 3;
            while (i < 2) ;

            System.out.println("Имя котёнка и возраст : " + phrase);
            --i;
        }

    static void example1() {
        String[] arrayCats = new String[]
                {"Бант", "Даша", "Пушок", "Айда", "Барсик", "Лорд", "Тишка", "Тоша", "Дружок", "Мурка"};

        int length = arrayCats.length;
        int ran = (int) Math.floor(Math.random() * length);
        int age = (int) Math.floor(Math.random() * 28);

        String phrase = arrayCats[ran] + " " + age;

        for (int j = 10; j > 5; j--) {
            System.out.println("Имя котёнка и возраст : " + phrase);
        }
    }

    static void example2() {
        String[] arrayCats = new String[]{"Бант", "Даша", "Пушок", "Айда", "Барсик"};
        int length = arrayCats.length;
        int ran = (int) Math.floor(Math.random() * length);
        int age = (int) Math.floor(Math.random() * 28);
        String phrase = arrayCats[ran] + " " + age;

        for (String i : arrayCats) {
            System.out.println(i);}
            {
                System.out.println("Имя котёнка и возраст : " + phrase);
            }

        }

    }








      //  Cat cat = new Cat("Мурка", 21);
      //  new Cat("Даша", 5);
      //  new Cat("Айда", 1);
      //  new Cat("Снежок", 4);
      //  new Cat("Барсик", 3);
      //  new Cat("Лорд", 2);
      //  new Cat("Тишка", 6);
      //  new Cat("Тоша", 15);
      //  new Cat("Дружок", 7);
      //  new Cat("Мурка", 12);
      //  Random random = new Random();















