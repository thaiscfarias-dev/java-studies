package com.example.MeuPrimeiroProjetoJava;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        MaiorNumero numero = new MaiorNumero();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Primeiro numero: ");
        numero.primeiroNumero = leitor.nextFloat();

        System.out.println("Segundo numero: ");
        numero.segundoNumero = leitor.nextFloat();

        numero.comprovarMaiorNumero();

        /* outra forma de resolver o problema com a classe retornando
        um valor float
         */
        MaiorNumero2 numero2 = new MaiorNumero2();

        System.out.println("Primeiro numero: ");
        numero2.primeiroNumero = leitor.nextFloat();

        System.out.println("Segundo numero: ");
        numero2.segundoNumero = leitor.nextFloat();

        if (numero2.verificarMaiorNumero() == 0) {
            System.out.println("os numeros sao iguais!");
        } else {
            System.out.println("o maior numero e: " + numero2.verificarMaiorNumero());
        }
    }
}
