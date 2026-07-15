package com.example.MeuPrimeiroProjetoJava;

import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {
        int soma;
//        for (int i = 0; i <= 100; i++) {
//            soma = soma + i;
//        }

        soma = IntStream.rangeClosed(1, 100).sum();
        System.out.println("Soma de todos os numeros de 1 a 100: " + soma);

    }
}
