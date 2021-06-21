package com.company;

public class Main {

    public static void main(String[] args) {
        float populaA = 800000F;
        float populaB = 2000000F;
        int anos  = 0;

        while (populaA < populaB) {
           anos ++;
            populaA =+ populaA * 0.03F;
            populaB =+populaB * 0.015F;
        }
        System.out.println("quantidade de anos necessarios seriam: " + anos);
    }
}



