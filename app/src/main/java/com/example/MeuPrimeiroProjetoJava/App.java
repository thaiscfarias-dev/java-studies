package com.example.MeuPrimeiroProjetoJava;

import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ContaBancaria conta = new ContaBancaria();

            int opcao;
            double valor;

            System.out.println("Digite o nome do titular: ");
            conta.titular = scanner.nextLine();

            do {

                System.out.println("""
                                   Digite uma opção:
                                   1 - Depositar
                                   2 - Sacar
                                   3 - Consultar saldo
                                   4 - Sair
                                   """);
                opcao = lerNumero(scanner);

                switch (opcao) {
                    case 1 -> {
                        System.out.println("Valor do depósito: R$ ");
                        valor = scanner.nextDouble();
                        conta.depositar(valor);
                    }
                    case 2 -> {
                        System.out.println("Valor do saque: R$ ");
                        valor = scanner.nextDouble();
                        conta.sacar(valor);
                    }
                    case 3 -> {
                        conta.consultarSaldo();
                    }
                    case 4 ->
                        System.out.println("Até logo!");
                    default ->
                        System.out.println("Opção inválida");
                }

            } while (opcao != 4);
        }
    }

    public static int lerNumero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Escolha um número do menu");
                scanner.next();
            }
        }
    }
}
