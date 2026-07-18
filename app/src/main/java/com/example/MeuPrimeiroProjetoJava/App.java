package com.example.MeuPrimeiroProjetoJava;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Integer> pares = new ArrayList<>();
            ArrayList<Integer> impares = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                System.out.printf("Digite o %dº número: ", (i + 1));
                int numero = lerNumero(scanner);

                if (numero % 2 == 0) {
                    pares.add(numero);
                } else {
                    impares.add(numero);
                }
            }

            System.out.println("Números pares: \n" + pares + "\n" + pares.size()
                    + " números pares");

            System.out.println("Números ímpares: \n" + impares + "\n" + impares.size()
                    + " números ímpares");

        }
    }

    public static int lerNumero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite apenas números");
                scanner.next();
            }
        }
    }
}
