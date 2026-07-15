package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    /**
     * O fatorial é um conceito matemático muito simples, mas que cresce
     * incrivelmente rápido.Representado pelo ponto de exclamação (!), o
     * fatorial de um número inteiro positivo n(chamado de n!) é o produto (a
     * multiplicação) de todos os números inteiros positivos de 1 até n.
     *
     * A Regra Especial: 0! Por definição matemática, existe uma regra
     * importante que costuma confundir quem está começando:O fatorial de 0 é
     * igual a 1 (0! = 1).O fatorial de 1 também é igual a 1 (1! = 1).Por que 0!
     * = 1? Uma das formas de entender isso é pensar em "combinações". O
     * fatorial serve para descobrir de quantas maneiras diferentes podemos
     * organizar um grupo de coisas. De quantas maneiras você pode organizar
     * zero objetos? Existe apenas uma maneira: não colocar nada lá.
     *
     * @param args
     */
    public static void main(String[] args) {
        int numero;
        long fatorial = 1;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("quer saber o fatorial de qual numero? ");
            numero = scanner.nextInt();
            
            if (numero == 0) {
                System.out.println("o fatorial de 0 e 1");
            } else {
                for (int i = 1; i <= numero; i++) {
                    fatorial = fatorial * i;
                }

                System.out.println("o fatorial de " + numero + " e: " + fatorial);
            }
            
        } catch (InputMismatchException e) {
            System.out.println("entrada invalida");
        }
    }
}
