package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra:");

        String letra = scan.next();

        switch (letra) {
            case "a":{

            }
            case "e": {

            }
            case "i":{

            }

            case "o":{

            }
            case "u":{

            }
            switch(letra){
                case "A":{
                }
                case "E": {

                }
                case "I":{

                }

                case "O":{

                }
                case "U":{

                }
            }
                System.out.println("A letra " + letra + " É vogal");
                break;
            default:
                System.out.println("A letra " + letra + " É consoante");
           }
        }
    }