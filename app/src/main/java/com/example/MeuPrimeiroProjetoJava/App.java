package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        boolean tentarNovamente = true;

        try (Scanner leitor = new Scanner(System.in)) {

            while (tentarNovamente) {
                try {
                    AnoBissexto ano = new AnoBissexto();

                    System.out.println("digite o ano: ");
                    ano.ano = leitor.nextInt();

                    System.out.println(ano.verificarAnoBissexto());
                    tentarNovamente = false;

                } catch (InputMismatchException e) {
                    System.out.println("entrada invalida. Tente novamente");
                    leitor.next();
                }

            }

        }
    }
}
