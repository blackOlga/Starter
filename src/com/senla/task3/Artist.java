package com.senla.task3;


import java.util.Scanner;

public class Artist {
    private static final String RED = "1";
    private static final String YELLOW_RED = "2";
    private static final String YELLOW = "3";
    private static final String GREEN = "4";
    private static final String WHITE_BLUE = "5";
    private static final String BLUE = "6";
    private static final String PURPLE = "7";
    private static final String GREY = " 8";


    public void palette(String number) {

        if (RED.equals(number)) {
            System.out.println("Красный");
        } else if (YELLOW_RED.equals(number)) {
            System.out.println("Жёлто-красный");
        } else if (YELLOW.equals(number)) {
            System.out.println("Жёлтый");
        } else if (GREEN.equals(number)) {
            System.out.println("Зелёный");
        } else {
            System.out.println("нет подходящего цвета");

        }


        switch (number) {
            case WHITE_BLUE: {
                System.out.println("Бело-синий");
            }
            break;
            case BLUE: {
                System.out.println("Синий");
            }
            break;
            case PURPLE: {
                System.out.println("Фиолетовый");
            }
            break;
            case GREY: {
                System.out.println("Серый");
            }
            default: {
                System.out.println("нет подходящего цвета");
            }
        }
    }
}













