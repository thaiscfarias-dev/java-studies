package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int soma = 0;
            final int quantidadeNumeros = 10;

            for (int i = 0; i < quantidadeNumeros; i++) {
                System.out.printf("Digite o %dº número: ", (i + 1));
                int numero = lerNumero(scanner);

                if (i % 2 == 0) {
                    soma += numero;
                }
            }

            System.out.printf("A soma dos números nas posições pares é: %d%n", soma);
        }

    }

    public static int lerNumero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite apenas números");
                scanner.next();
            }
        }
    }
}
