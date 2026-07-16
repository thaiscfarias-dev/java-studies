package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("digite um numero: ");
            int numero = scanner.nextInt();

            if (isPar(numero)) {
                System.out.println("par");
            } else {
                System.out.println("ímpar");
            }

        } catch (InputMismatchException e) {
            System.out.println("entrada invalida");
        }

    }

    private static boolean isPar(int numero) {
        return numero % 2 == 0;
    }
}
