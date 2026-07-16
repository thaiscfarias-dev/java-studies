package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            float numero1;
            float numero2;
            int opcao;

            System.out.println("Digite o primeiro número: ");
            numero1 = scanner.nextFloat();

            System.out.println("Digite o segundo número: ");
            numero2 = scanner.nextFloat();

            do {
                mostrarMenu();
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1 ->
                        System.out.println("Resultado: "
                                + somar(numero1, numero2));
                    case 2 ->
                        System.out.println("Resultado: "
                                + subtrair(numero1, numero2));
                    case 3 -> {
                        float resultado = dividir(numero1, numero2);
                        if (resultado == Float.NaN) {
                        } else {
                            System.out.println("Resultado: "
                                    + resultado);
                        }
                    }
                    case 4 ->
                        System.out.println("Resultado: "
                                + multiplicar(numero1, numero2));
                    case 5 ->
                        System.out.println("Até logo!");
                    default ->
                        System.out.println("Opção inválida!");
                }
            } while (opcao != 5);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida!");
        }
    }

    private static void mostrarMenu() {
        System.out.println("""
                               Qual operação deseja realizar?
                               1 - Somar
                               2 - Subtrair
                               3 - Dividir
                               4 - Multiplicar
                               5 - Sair
                               """);
    }

    private static float somar(float num1, float num2) {
        return num1 + num2;
    }

    private static float subtrair(float num1, float num2) {
        return num1 - num2;
    }

    private static float dividir(float num1, float num2) {
        if (num2 == 0) {
            System.out.println("Erro: não é possível dividir por zero");
            return Float.NaN;
        } else {
            return num1 / num2;
        }
    }

    private static float multiplicar(float num1, float num2) {
        return num1 * num2;
    }
}
