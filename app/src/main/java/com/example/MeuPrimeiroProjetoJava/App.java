package com.example.MeuPrimeiroProjetoJava;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Menu menu = new Menu();
        Leitor leitor = new Leitor();

        try (Scanner scanner = new Scanner(System.in)) {

            int opcao;

            do {

                menu.exibir();
                opcao = Leitor.lerNumero(scanner);

                switch (opcao) {
                    case 1 -> {
                        menu.inserirNumero(scanner);
                    }
                    case 2 -> {
                        System.out.println("Qual número deseja buscar? ");
                        menu.procurarNumero(Leitor.lerNumero(scanner));
                    }
                    case 3 ->
                        menu.mostrarTodos();
                    case 4 ->
                        System.out.println("Até logo!");
                    default ->
                        System.out.println("Opção inválida!");
                }
            } while (opcao != 4);
        }

    }
}
