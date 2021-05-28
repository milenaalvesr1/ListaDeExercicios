package EstruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {

        boolean longigual = true;
        while(longigual){

            String[] login = new String[2];
            System.out.println("digite nome de usuario");
            Scanner scanner = new Scanner(System.in);
            login[0] = scanner. next();

            System.out.println("digite sua senha");
            login[1] = scanner.next();
            if (!login[0].equals(login[1])) {
                longigual = false;
                break;

            }
        }
    }
}
