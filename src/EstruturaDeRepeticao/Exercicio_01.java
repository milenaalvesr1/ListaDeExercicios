package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {

        boolean numDigBoolean = true;

        while (numDigBoolean){
            System.out.println("digite uma nota de a 0 até 10;");
            Scanner scanner =new Scanner(System.in);
            int numDig = scanner.nextInt();

            for (int i=0; i <=10; i++){
                if(numDig == i){
                    System.out.println("valor valido,parabens.");
                    numDigBoolean = false;

                }
            }

        }
    }
}