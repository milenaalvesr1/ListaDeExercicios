package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio_03
{
    public static void main(String[] args) {
        System.out.println("digite um numero para ser somado");
        Scanner myObj =new Scanner(System.in);
        int numero01 = myObj.nextInt();
        System.out.println("digite um segundo numero");
        int numero02 = myObj.nextInt();
        int soma =numero01 + numero02;
        System.out.println("resultado da soma: " + soma);
    }
}
