package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio_01_1 {

    public static void main(String[] args) {
        boolean numDigBoolean = false;
        while (!numDigBoolean) {
            System.out.println("digite um numero de 0 á 10");
            Scanner scanner = new Scanner(System.in);
            int numdig = scanner.nextInt();

            if (numdig <= 10 && numdig >= 0) {
                System.out.println("nota é valida");
                numDigBoolean = true;
            } else {
                System.out.println("nota não é valida");

            }

        }
    }
}