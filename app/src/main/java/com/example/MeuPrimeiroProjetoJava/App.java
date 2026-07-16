package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        float num1;
        float num2;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("primeiro numero: ");
            num1 = scanner.nextFloat();

            System.out.println("segundo numero: ");
            num2 = scanner.nextFloat();

            System.out.println(verificarMaior(num1, num2));

        } catch (InputMismatchException e) {
            System.out.println("entrada invalida");
        }

    }

    private static String verificarMaior(float num1, float num2) {
        if (num1 > num2) {
            return num1 + " eh maior";
        } else if (num1 == num2) {
            return "sao iguais";
        } else {
            return num2 + " eh maior";
        }
    }
}
