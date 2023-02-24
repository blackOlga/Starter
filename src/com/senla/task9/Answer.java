package com.senla.task9;

import java.util.Locale;

public class Answer {
    public static void main(String[] args) throws AnswerNotPointException {
        String text = null;
        give(text);
        System.out.println(" Программа работает");

    }

    private static void give(String text)  throws  AnswerNotPointException{
        try {
            System.out.println(text.toUpperCase(Locale.ROOT));
            System.err.println("Произошла ошибка");
            if (text == null){
                throw new AnswerNotPointException("Значение отсутствует");
            }
        } catch (NullPointerException e) {
        }
        System.out.println("Произошла ошибка");

    }}




