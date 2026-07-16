package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        float numero1;
        float numero2;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("primeiro numero: ");
            numero1 = scanner.nextFloat();

            System.out.println("segundo numero: ");
            numero2 = scanner.nextFloat();

            System.out.println("a soma eh: " + somar(numero1, numero2));

        } catch (InputMismatchException e) {
            System.out.println("entrada invalida!");
        }

    }

    private static float somar(float num1, float num2) {
        return num1 + num2;
    }
}
