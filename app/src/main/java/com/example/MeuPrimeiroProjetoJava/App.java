package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Menu menu = new Menu();

        try(Scanner scanner = new Scanner(System.in)){
        
            menu.exibir();
            int opcao = lerNumero(scanner);

            do {
                switch (opcao) {
                    case 1 ->
                        menu.inserirNumeros();
                    case 2 ->
                        menu.procurarNumero();
                    case 3 ->
                        menu.mostrarTodos();
                    default ->
                        System.out.println("Até logo!");
                }
            } while (opcao != 4);
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
