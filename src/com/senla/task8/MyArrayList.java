package com.senla.task8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class MyArrayList implements MyListImpl<Integer> {

    public static <T> List<Integer> harvest() {

        List<Integer> chapterOfTheBooks = new ArrayList<>(10);
        ArrayList<Integer> chaps = new ArrayList<>();


        ChapterOfTheBook<Integer> chapterOfTheBook1 = new ChapterOfTheBook<>(10);
        ChapterOfTheBook<Integer> chapterOfTheBook2 = new ChapterOfTheBook<>(20);
        ChapterOfTheBook<Integer> chapterOfTheBook3 = new ChapterOfTheBook<>(15);
        ChapterOfTheBook<Integer> chapterOfTheBook4 = new ChapterOfTheBook<>(9);
        ChapterOfTheBook<Integer> chapterOfTheBook5 = new ChapterOfTheBook<>(12);
        ChapterOfTheBook<Integer> chapterOfTheBook6 = new ChapterOfTheBook<>(18);
        ChapterOfTheBook<Integer> chapterOfTheBook7 = new ChapterOfTheBook<>(8);
        ChapterOfTheBook<Integer> chapterOfTheBook8 = new ChapterOfTheBook<>(10);
        ChapterOfTheBook<Integer> chapterOfTheBook9 = new ChapterOfTheBook<>(13);
        ChapterOfTheBook<Integer> chapterOfTheBook10 = new ChapterOfTheBook<>(14);
        ChapterOfTheBook<Integer> chapterOfTheBook11 = new ChapterOfTheBook<>(19);
        ChapterOfTheBook<Integer> chapterOfTheBook12 = new ChapterOfTheBook<>(21);
        ChapterOfTheBook<Integer> chapterOfTheBook13 = new ChapterOfTheBook<>(23);
        ChapterOfTheBook<Integer> chapterOfTheBook14 = new ChapterOfTheBook<>(24);
        ChapterOfTheBook<Integer> chapterOfTheBook15 = new ChapterOfTheBook<>(25);
        ChapterOfTheBook<Integer> chapterOfTheBook16 = new ChapterOfTheBook<>(26);


        chapterOfTheBooks.add(chapterOfTheBook1.getPages());
        chapterOfTheBooks.add(chapterOfTheBook2.getPages());
        chapterOfTheBooks.add(chapterOfTheBook3.getPages());
        chapterOfTheBooks.add(chapterOfTheBook4.getPages());
        chapterOfTheBooks.add(chapterOfTheBook5.getPages());
        chapterOfTheBooks.add(chapterOfTheBook6.getPages());
        chapterOfTheBooks.add(chapterOfTheBook7.getPages());
        chapterOfTheBooks.add(chapterOfTheBook8.getPages());
        chapterOfTheBooks.add(chapterOfTheBook9.getPages());
        chapterOfTheBooks.add(8, chapterOfTheBook10.getPages());

        chapterOfTheBooks.forEach(System.out::println);
        System.out.println("Вывела коллекцию chapterOfTheBooks(первая коллекция) на консоль");

        chaps.add(chapterOfTheBook11.getPages());
        chaps.add(chapterOfTheBook12.getPages());
        chaps.add(chapterOfTheBook13.getPages());
        chaps.add(chapterOfTheBook14.getPages());
        chaps.add(chapterOfTheBook15.getPages());
        chaps.add(chapterOfTheBook16.getPages());

        chaps.forEach(System.out::println);
        System.out.println("Вывела коллекцию chaps(вторая коллекция) на консоль");


        System.out.println(chapterOfTheBooks.get(0));
        System.out.println("Вернула объект из списка по индексу 0 с первой коллекции ");

        System.out.println(chapterOfTheBooks.size());
        System.out.println("Вывела  на консоль количество элементов в первой коллекции");

        System.out.println(chapterOfTheBooks.contains(14));
        System.out.println("Проверила содержиться ли элемент 14 в первой коллекции");

        System.out.println(chapterOfTheBooks.isEmpty());
        System.out.println("Проверила на наличие элементов в первой коллекции");

        System.out.println(chapterOfTheBooks.remove(5));
        System.out.println("Удалила элемент под индексом 5 из первой коллекции");


        if (chapterOfTheBooks.size() != 0) {
            for (Integer chapterOfTheBook : chapterOfTheBooks) {
                System.out.println(chapterOfTheBook);
                System.out.println("Вывела на консоль элементы первой коллекции");
            }
            System.out.println(chapterOfTheBooks.add(chapterOfTheBook1.getPages()));
            System.out.println("Добавила элемент в первую коллекцию");

            System.out.println(chapterOfTheBooks.add(chapterOfTheBook3.getPages()));
            System.out.println();

            System.out.println(chapterOfTheBooks.size());
            System.out.println("Вывела на консоль  количество элементов в  первой коллекции");


            Iterator<Integer> iterator = chapterOfTheBooks.iterator();


            while (iterator.hasNext()) {
                System.out.println(iterator.next());
                System.out.println("Итератор перебирает первую коллекцию");
            }

            System.out.println(chaps.size());
            System.out.println("Вывела на консоль количество  элементов во второй коллекции");

            chaps.addAll(chapterOfTheBooks);

            if (chaps.size() != 0) {
                for (Integer chapterOfTheBook : chaps) {
                    System.out.println(chapterOfTheBook);
                    System.out.println("Вывела на консоль вторую коллекцию , после добавления первой коллекции");
                }
                System.out.println(chaps.get(16));
                System.out.println("Вывела на консоль объект из списка по индексу");

                System.out.println(chaps.remove(13));
                System.out.println("Удалила элемент по индексу, вернулось значение удаленного объекта");

                System.out.println(chaps.set(10,chapterOfTheBook4.getPages()));
                System.out.println("Присвоила значение объекта элементу под определенным индексом");

                System.out.println(chaps.indexOf(chapterOfTheBook6));
                System.out.println("Искала индекс первого вхождения объекта");


            }
            class iterator implements Iterator {
                @Override
                public void remove() {
                    Iterator.super.remove();
                }

                @Override
                public void forEachRemaining(Consumer action) {
                    Iterator.super.forEachRemaining(action);
                }

                public iterator() {
                    super();
                }

                @Override
                public int hashCode() {
                    return super.hashCode();
                }

                @Override
                public boolean equals(Object obj) {
                    return super.equals(obj);
                }

                @Override
                protected Object clone() throws CloneNotSupportedException {
                    return super.clone();
                }

                @Override
                public String toString() {
                    return super.toString();
                }

                @Override
                public boolean hasNext() {
                    return false;
                }

                @Override
                public Object next() {
                    return null;
                }
            }
        }
        return chapterOfTheBooks;
    }

    @Override
    public Integer getName() {
        return null;
    }

    @Override
    public void size() {
    }

    @Override
    public void isEmpty() {
    }

    @Override
    public void contains(Object value) {
    }

    @Override
    public void add(Integer value) {
    }

    @Override
    public void remove(Object value) {
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        MyListImpl.super.forEach(action);
    }

    @Override
    public void addAll(Collection<? extends Integer> value) {
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}




