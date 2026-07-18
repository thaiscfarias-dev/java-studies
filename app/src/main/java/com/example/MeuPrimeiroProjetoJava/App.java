package com.example.MeuPrimeiroProjetoJava;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(System.in)){
        
            /* é uma convenção em java utilizar constantes em letras maiúsculas */
            final int QUANTIDADE_NUMEROS = 5;
            int[] numeros = new int[QUANTIDADE_NUMEROS];
            int[] invertido = new int[numeros.length];
            
            for(int i = 0; i < numeros.length; i++){
                System.out.printf("Digite o %dº número: ", (i + 1));
                numeros[i] = lerNumero(scanner);
            }
            
            for(int i = 0; i < numeros.length; i++){
                invertido[i] = numeros[numeros.length - 1 - i];
            }
            
            System.out.println("Original: " + Arrays.toString(numeros));
            System.out.println("Invertido: " + Arrays.toString(invertido));
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
