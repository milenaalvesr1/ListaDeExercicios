package EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio_05_1 {

    public static void main(String[] args) {
        System.out.println("digite a primeira notas parciais");
        Scanner Nota = new Scanner(System.in);
        float nota1 = Nota.nextFloat();


        System.out.println("digite a segunda notas parciais");
        float nota2 = Nota.nextFloat();

        float media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("aprovado");
        } else if (media < 7) {
            System.out.println("reprovado");
        } else if (media == 10) {
            System.out.println("aprovado com distinção");
        }
    }

}
