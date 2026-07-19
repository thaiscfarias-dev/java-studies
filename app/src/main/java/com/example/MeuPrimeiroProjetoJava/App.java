package com.example.MeuPrimeiroProjetoJava;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            boolean palindromo = true;
            String texto;

            System.out.println("Digite um texto/palavra: ");
            texto = scanner.nextLine();
            texto = texto.toLowerCase().replace(" ", "");

            for (int i = 0; i < texto.length() / 2; i++) {

                if (texto.charAt(i) != texto.charAt(texto.length() - 1 - i)) {
                    palindromo = false;
                    break;
                }
            }

            if (palindromo) {
                System.out.println("É um palíndromo");
            } else {
                System.out.println("Não é um palíndromo");
            }
        }
    }
}
