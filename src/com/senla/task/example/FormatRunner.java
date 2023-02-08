package com.senla.task.example;

public class FormatRunner {
    public static final String FOR_EXAMPLE = "%s. Заголовок  письма для организации %s";


    public static void main(String[] args) {
        String str = String.format(FOR_EXAMPLE, 1, "Простоквашино");
        System.out.println(str);
        DateRunner.present();

    }


}
