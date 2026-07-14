package com.example.MeuPrimeiroProjetoJava;

import java.util.Scanner;

/* main é uma classe */
public class App {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o peso: ");
        pessoa.peso = leitor.nextFloat();

        System.out.println("Digite a altura: ");
        pessoa.altura = leitor.nextFloat();
        
        System.out.println("IMC = " + pessoa.calcularIMC());
        
    }
}
