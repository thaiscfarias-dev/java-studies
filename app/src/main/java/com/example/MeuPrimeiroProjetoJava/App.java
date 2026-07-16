package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            float[] notas = new float[5];

            for (int i = 0; i < notas.length; i++) {
                System.out.println("Digite a nota do aluno: ");
                notas[i] = scanner.nextFloat();
            }

            float maior = notas[0];
            float menor = notas[0];
            float soma = 0.0f;
            float media = 0.0f;
            int aprovados = 0;
            int reprovados = 0;

            System.out.println("Notas digitadas: ");

            for (int i = 0; i < notas.length; i++) {
                System.out.println(notas[i]);

                if (maior < notas[i]) {
                    maior = notas[i];
                }
                if (menor > notas[i]) {
                    menor = notas[i];
                }
                soma += notas[i];
                if (notas[i] >= 7) {
                    aprovados++;
                } else {
                    reprovados++;
                }
            }
            media = soma / notas.length;

            System.out.println("Maior nota: " + maior);
            System.out.println("Menor nota: " + menor);
            System.out.println("Média: " + media);
            System.out.println("Aprovados: " + aprovados);
            System.out.println("Reprovados: " + reprovados);
            System.out.println("Alunos aprovados: " + reprovados);

            for (int i = 0; i < notas.length; i++) {
                if (notas[i] >= 7) {
                    System.out.println("Posição " + i + " -> "
                            + notas[i]);
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida!");
        }

    }
}
