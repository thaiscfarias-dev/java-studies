package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Gerenciador gerenciador = new Gerenciador();
        int opcao = 0;

        try (Scanner leitor = new Scanner(System.in)) {

            do {

                try {
                    System.out.println("""
                                       1 - cadastrar 
                                       2 - editar
                                       3 - excluir
                                       4 - sair""");
                    opcao = leitor.nextInt();

                    switch (opcao) {
                        case 1 -> gerenciador.cadastrar();
                        case 2 -> gerenciador.editar();
                        case 3 -> gerenciador.excluir();
                        case 4 -> System.out.println("ate logo!");
                        default -> System.out.println("opcao nao existe. Tente novamente");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("entrada invalida. Tente novamente");
                    leitor.next();
                }

            } while (opcao != 4);

        }

    }
}
