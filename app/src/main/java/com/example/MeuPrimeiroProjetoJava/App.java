package com.example.MeuPrimeiroProjetoJava;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            int[] numeros = new int[5];

            for (int i = 0; i < numeros.length; i++) {

                try {
                    System.out.printf("Digite o %dº número: ", i + 1);
                    numeros[i] = scanner.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("Digite apenas números!");
                    scanner.next();
                    i--;
                }
            }

            Arrays.sort(numeros);
            System.out.println("A ordem dos números é: "
                    + Arrays.toString(numeros));

        }

    }
}
