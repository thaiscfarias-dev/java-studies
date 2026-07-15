package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int numero;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("digite um numero para saber se eh primo: ");
            numero = scanner.nextInt();

            if (ehPrimo(numero)) {
                System.out.println("eh primo!");
            } else {
                System.out.println("nao eh primo!");
            }

        } catch (InputMismatchException e) {
            System.out.println("entrada invalida");
        }

    }

    public static boolean ehPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        if (numero == 2) {
            return false;
        }

        if (numero % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
