package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio_04
{
    public static void main(String[] args) {
        Scanner myObj =new Scanner(System.in);

        System.out.println("digite o valor da primeira nota");
        int nota01 = myObj.nextInt();

        System.out.println("digite o valor da segunda nota");
        int nota02 = myObj.nextInt();

        System.out.println("digite o valor da terceira nota");
        int nota03 = myObj.nextInt();

        System.out.println("digite o valor da quarta nota");
        int nota04 = myObj.nextInt();

        int soma =nota01 + nota02 +nota03 + nota04;

        System.out.println("resultado da soma: " + (soma/4));
    }
}