package com.example.MeuPrimeiroProjetoJava;

public class App {

    public static void main(String[] args) {

        int totalAlunos = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println("For: " + i);
        }

        while (totalAlunos < 10) {
            totalAlunos++;
            System.out.println("While: " + totalAlunos);
        }
    }
}
