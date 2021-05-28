package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("digite a distancia em metro");
        float distanciaMetro = myObj.nextFloat();
        float distanciaEmCentimentro = distanciaMetro  * 100;
        System.out.println("distancia digitada em centimentro: "+ distanciaEmCentimentro);


    }
}
