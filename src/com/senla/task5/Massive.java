package com.senla.task5;

import java.util.Random;


public class Massive {
    public static void draw() {
        StringBuilder sb = new StringBuilder();
        String string = sb.toString();
        Random r = new Random();

        double[][] arrayMass = new double[10][10];

        for (int i = 0; i < arrayMass.length; i++) {
            for (int j = 0; j < arrayMass[i].length; j++) {

               double min =-1.79769;
               double max = 1.79769;
                arrayMass[i][j] =r.nextDouble();
            }
        }
        for (int i = 0; i < arrayMass.length; i++) {
            for (int j = 0; j < arrayMass[i].length; j++) {
                int length = 10;

                System.out.print(arrayMass[i][j] + " ");
            }
            System.out.println();
        }
     for (int i = 0; i < arrayMass.length;i++)
     {
         System.out.println(arrayMass[i][i]);
     }
     for (int i = 0; i < arrayMass.length;i++)
     {
         System.out.println(arrayMass[i][arrayMass.length-1-i]);
     }
     int i = 0;
      if (arrayMass[i][i] ==arrayMass[i][arrayMass.length-1-i])
        { System.out.println( "true");
        }else{  System.out.println("false");
     }
     double counter =  0;
      double[] arrMass =new double[arrayMass.length] ;
      for( double[] j : arrayMass){
          arrMass[(int)counter] = j[(int) counter];
          counter++;
         // System.out.println(arrMass[i]+" ");
          System.out.println(java.util.Arrays.toString(arrMass));
      }
    }
}











