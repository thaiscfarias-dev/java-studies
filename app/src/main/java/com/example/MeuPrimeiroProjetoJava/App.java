package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        /* colocar o Scanner dentro do try garante que o Scanner será encerrado
            assim que o bloco try fechar, consumindo menos memoria. Não precisa
            lembrar de digitar leitor.close();
         */
        try (Scanner leitor = new Scanner(System.in)) {

            IMC imc = new IMC();
            boolean continuarTentando = true;

            while (continuarTentando) {

                try {

                    System.out.println("digite o peso: ");
                    imc.peso = leitor.nextFloat();
                    System.out.println("digite a altura: ");
                    imc.altura = leitor.nextFloat();
                    System.out.println("o IMC e: " + imc.calcularIMC());

                    continuarTentando = false;

                } catch (InputMismatchException e) {
                    System.out.println("entrada invalida. Tente novamente");
                    leitor.next();
                }
            }
        }

    }
}
