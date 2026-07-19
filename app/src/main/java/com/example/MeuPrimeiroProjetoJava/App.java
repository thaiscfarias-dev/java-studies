package com.example.MeuPrimeiroProjetoJava;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String texto;
            int quantidade = 1;

            System.out.println("Digite um texto/frase: ");
            texto = scanner.nextLine();

            for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i) == ' ') {
                    quantidade++;
                }
            }

            System.out.println("Quantidade de palavras: " + quantidade);

            /*
            
            split(" ") quebra a frase sempre que encontra um espaço
            
            O que significa \\s+?
            \\s → qualquer espaço em branco (espaço, tabulação, quebra de linha).
            + → um ou mais.

            Então, não importa se houver 1, 5 ou 20 espaços entre as palavras.
             */
            String[] palavras = texto.trim().split("\\s+");
            System.out.println("Quantidade de palavras método split: " + palavras.length);
        }

    }
}
