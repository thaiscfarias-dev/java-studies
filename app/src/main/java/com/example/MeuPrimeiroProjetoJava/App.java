package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {
            PositivoOuNegativo verifica = new PositivoOuNegativo();
            boolean entradaValida = false;

            while (!entradaValida) {
                try {
                    System.out.println("digite um numero: ");
                    verifica.numero = leitor.nextFloat();

                    System.out.println(verifica.verificarPositivoOuNegativo());
                    entradaValida = true;

                } catch (InputMismatchException e) {
                    System.out.println("entrada invalida. Tente novamente");
                    leitor.next();
                }

            }
        }

    }
}
