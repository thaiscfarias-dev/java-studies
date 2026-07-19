package com.example.MeuPrimeiroProjetoJava;

import java.util.Scanner;
import java.util.HashMap;

public class App {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String frase;
            /* Um HashMap guarda informações em pares de chave e valor. */
            HashMap<Character, Integer> contador = new HashMap<>();

            System.out.println("Digite uma frase: ");
            frase = scanner.nextLine();
            frase = frase.toLowerCase().replace(" ", "");

            for (int i = 0; i < frase.length(); i++) {

                char letra = frase.charAt(i);

                if (contador.containsKey(letra)) {
                    contador.put(letra, contador.get(letra) + 1);
                } else {
                    contador.put(letra, 1);
                }
            }
            System.out.println(contador);

        }
    }
}
