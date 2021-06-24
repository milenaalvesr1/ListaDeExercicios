package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros.length; j++) {
                System.out.println("digite o valor numero" + (i + 1  ));
                Scanner myobj = new Scanner(System.in);
                numeros[i] = myobj.nextInt();
            }


            for (int j = 0;j < numeros.length; j++) {


                if (i == numeros.length - 1) {
                    System.out.println(numeros[i] + ".");
                } else {
                    System.out.println(numeros[i] + ",");


                }
            }
        }
    }
}



