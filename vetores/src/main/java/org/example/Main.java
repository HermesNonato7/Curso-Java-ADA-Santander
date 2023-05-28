package org.example;

// Arrays com números e letras

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        int[] numeros = new int[5];
        // [0] [1] [2] [3] [4]
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        for (int i=0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        */

        // Operações com Arrays

        int[] numeros2 = {9, 10, 12, 25, 2};
        int maior = numeros2[0];
        int menor = numeros2[0];
        int media = 0;

        for (int k = 0; k < numeros2.length; k++) {
            if (numeros2[k] > maior) {
                maior = numeros2[k];
            }
            if (numeros2[k] < menor) {
                menor = numeros2[k];
            }
            media += numeros2[k];

            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Média: " + media / numeros2.length);
            break;
        }

        System.out.println();

        /*
        String[] letras = new String[5];
        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        letras[4] = "E";

        for(int j=0; j < letras.length; j++) {
            System.out.println(letras[j]);
        }
        */

        String[] letras = {"A", "B", "C", "D", "E"};
        //for(int j=0; j < letras.length; j++) {
        //   System.out.println(letras[j]);
        // }

        System.out.println(Arrays.toString(letras));
    }
}

