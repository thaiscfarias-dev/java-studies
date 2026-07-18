package com.example.MeuPrimeiroProjetoJava;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        final int QUANTIDADE_NUMEROS = 10;
        Integer[] numeros = new Integer[QUANTIDADE_NUMEROS];
        
        try(Scanner scanner = new Scanner(System.in)){
            for (int i = 0; i < numeros.length; i++) {
                System.out.printf("Digite o %dº número: ", i + 1);
                numeros[i] = lerNumero(scanner);
            }
            
            LinkedHashSet<Integer> numerosUnicos = new LinkedHashSet<>(Arrays.asList(numeros));
            System.out.println("Lista COM os números repetidos: " + Arrays.toString(numeros));
            System.out.println("Lista SEM os números repetidos: " + numerosUnicos);
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
