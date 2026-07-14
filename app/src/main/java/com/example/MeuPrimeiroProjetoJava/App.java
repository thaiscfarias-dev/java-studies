package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {

            Triangulo triangulo = new Triangulo();
            boolean tentarNovamente = true;

            while (tentarNovamente) {

                try {
                    System.out.println("lado 1: ");
                    triangulo.lado1 = leitor.nextFloat();

                    System.out.println("lado 2: ");
                    triangulo.lado2 = leitor.nextFloat();

                    System.out.println("lado 3: ");
                    triangulo.lado3 = leitor.nextFloat();

                    if (triangulo.verificarSeTrianguloExiste() == true) {
                        System.out.println(triangulo.verificarTipoTriangulo());
                    } else {
                        System.out.println("nao e um triangulo valido");
                        continue;
                    }

                    tentarNovamente = false;

                } catch (InputMismatchException e) {
                    System.out.println("entrada invalida. Tente novamente");
                    leitor.next();
                }

            }
        }

    }
}
