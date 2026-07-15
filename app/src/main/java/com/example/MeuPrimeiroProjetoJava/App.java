package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int numero;
        int resultado;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("digite um numero para a tabuada: ");
            numero = scanner.nextInt();

            for (int i = 0; i <= 10; i++) {
                resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }

        } catch (InputMismatchException e) {
            System.out.println("entrada invalida");
        }
    }
}
