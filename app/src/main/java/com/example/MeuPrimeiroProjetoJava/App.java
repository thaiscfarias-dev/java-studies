package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int[] numeros = new int[5];

            for (int i = 0; i < numeros.length; i++) {
                System.out.println("número: ");
                numeros[i] = scanner.nextInt();
            }

            int maior = numeros[0];
            int menor = numeros[0];
            int soma = 0;
            float media = 0;

            for (int i = 1; i < numeros.length; i++) {

                if (numeros[i] > maior) {
                    maior = numeros[i];
                }

                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }

            System.out.println("O maior número é: " + maior);
            System.out.println("O menor número é: " + menor);

            for (int i = 0; i < numeros.length; i++) {
                soma = soma + numeros[i];
            }
            System.out.println("A soma é: " + soma);

            media = (float) soma / numeros.length;
            System.out.println("A média é: " + media);

        } catch (InputMismatchException e) {
        }
    }
}
