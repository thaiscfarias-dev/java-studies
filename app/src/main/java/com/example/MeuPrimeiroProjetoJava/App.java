package com.example.MeuPrimeiroProjetoJava;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ParOuImpar parOuImpar = new ParOuImpar();

        Scanner leitor = new Scanner(System.in);

        System.out.println("digite um numero: ");
        parOuImpar.numero = leitor.nextFloat();

        System.out.println(parOuImpar.verificarParOuImpar());

    }
}
