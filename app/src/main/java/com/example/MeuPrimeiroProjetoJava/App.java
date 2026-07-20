package com.example.MeuPrimeiroProjetoJava;

import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Aluno aluno = new Aluno();
            
            System.out.println("Digite o nome do aluno: ");
            aluno.nome = scanner.nextLine();

            System.out.println("Digite a primeira nota: ");
            aluno.nota1 = lerNota(scanner);

            System.out.println("Digite a segunda nota: ");
            aluno.nota2 = lerNota(scanner);
            
            aluno.calcularMedia();
            aluno.aprovado();
        }

    }

    public static float lerNota(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida");
                scanner.next();
            }
        }
    }
}
