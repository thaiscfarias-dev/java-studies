package com.example.MeuPrimeiroProjetoJava;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite uma frase: ");
            String frase = scanner.nextLine();

            int quantidadeVogais = 0;
            String vogais = "aeiouáàéèíìóòúùäëïöüãõâêîôû";

            frase = frase.toLowerCase();

            for (int i = 0; i < frase.length(); i++) {
                char letra = frase.charAt(i);

              /*
                 0 ou maior → encontrou o caractere.
                -1 → não encontrou.
              */
                if (vogais.indexOf(letra) != -1) {
                    quantidadeVogais++;
                }
            }

            System.out.println("Quantidade de vogais: " + quantidadeVogais);
        }

    }
}
