package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        boolean encontrado = false;
        int[] numeros = new int[5];
        int numero;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = lerNumero(scanner);
        }

        System.out.println("Qual número deseja procurar? ");
        numero = lerNumero(scanner);

        for (int i = 0; i < numeros.length; i++) {
            if (numero == numeros[i]) {
                encontrado = true;
                System.out.println("Número encontrado. Posição: " + (i + 1));
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado.");
        }
        scanner.close();
    }

    public static int lerNumero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números");
                scanner.next();
            }
        }
    }
}
