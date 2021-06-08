package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número:");
        numero1 = scanner.nextInt();

        if (numero1 > 0) {
            System.out.println("Numero Positivo");
        } else {
            System.out.println("Numero Negativo");
        }
    }
}
