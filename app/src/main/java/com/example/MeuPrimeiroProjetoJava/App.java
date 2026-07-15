package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class App {

    public static void main(String[] args) {
        int numero;
        // o numero superior é exclusivo, por isso usamos o 6 se queremos de 1 a 5
        int numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 6);

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("tente acertar o numero aleatorio (1 a 5): ");
                numero = scanner.nextInt();

            } while (numero != numeroAleatorio);

            System.out.println("parabens! voce acertou!");
            
        } catch (InputMismatchException e) {
            System.out.println("entrada invalida");
        }

    }
}
