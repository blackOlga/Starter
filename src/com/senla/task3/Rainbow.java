package com.senla.task3;


import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        Artist artist = new Artist();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любую цифру от 1 до 8 : ");
        String number = scanner.nextLine();
        artist.palette(number);


    }


}