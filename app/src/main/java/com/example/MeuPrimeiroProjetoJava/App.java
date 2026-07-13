package com.example.MeuPrimeiroProjetoJava;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int numero;

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = leitorScanner.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo");
        } else {
            System.out.println("O número não está no intervalo");
        }
    }
}
