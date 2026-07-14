package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        boolean rodando = true;
        int opcao;

        try (Scanner leitor = new Scanner(System.in)) {

            while (rodando) {

                try {

                    System.out.println("digite uma opcao: ");
                    System.out.println("1 - somar ");
                    System.out.println("2 - subtrair ");
                    System.out.println("3 - dividir ");
                    System.out.println("4 - multiplicar ");
                    System.out.println("5 - sair ");

                    opcao = leitor.nextInt();

                    if (opcao == 5) {
                        System.out.println("saindo...ate logo!");
                        rodando = false;
                        continue;
                    }

                    if (opcao < 1 || opcao > 5) {
                        System.out.println("opcao invalida. Escolha um numero de 1 a 5");
                        continue;
                    }

                    System.out.println("digite o primero numero: ");
                    float numero1 = leitor.nextFloat();

                    System.out.println("digite o segundo numero: ");
                    float numero2 = leitor.nextFloat();

                    switch (opcao) {
                        case 1 -> {
                            Soma soma = new Soma();
                            soma.primeiroNumero = numero1;
                            soma.segundoNumero = numero2;
                            System.out.println("resultado da soma: " + soma.Somar());
                        }
                        case 2 -> {
                            Subtracao subtracao = new Subtracao();
                            subtracao.primeiroNumero = numero1;
                            subtracao.segundoNumero = numero2;

                            System.out.println("resultado da subtracao: "
                                    + subtracao.Subtrair());
                        }
                        case 3 -> {
                            Divisao divisao = new Divisao();
                            divisao.primeiroNumero = numero1;
                            divisao.segundoNumero = numero2;

                            System.out.println("resultado da divisao: "
                                    + divisao.Dividir());
                        }
                        case 4 -> {
                            Multiplicacao multiplicacao = new Multiplicacao();
                            multiplicacao.primeiroNumero = numero1;
                            multiplicacao.segundoNumero = numero2;

                            System.out.println("resultado da multiplicacao: "
                                    + multiplicacao.Multiplicar());
                        }

                    }

                } catch (InputMismatchException e) {
                    System.out.println("entrada invalida. Tente novamente");
                    leitor.next();
                }

            }

        }

    }
}
