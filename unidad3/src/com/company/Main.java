package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Informe seu gênero:(masculino ou feminino)");
        Scanner scanner = new Scanner(System.in);
        char genero = scanner.next().charAt(0);
        if (genero == 'M' || genero == 'm') {
            System.out.println("Masculino");
        } else if (genero == 'F' || genero == 'f') {
            System.out.println("Feminino");
        } else {
            System.err.println("Sexo inválido");
        }

    }
}
