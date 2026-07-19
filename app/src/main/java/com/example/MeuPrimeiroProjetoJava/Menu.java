/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MeuPrimeiroProjetoJava;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Menu {

    private static final int QUANTIDADE_NUMEROS = 10;
    private final int[] numeros = new int[QUANTIDADE_NUMEROS];
    

    public void exibir() {
        System.out.println("""
               Escolha uma opção:
               1 - Inserir números
               2 - Procurar número
               3 - Mostrar todos
               4 - Sair
               """);
    }

    public void inserirNumero(Scanner scanner) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = Leitor.lerNumero(scanner);
        }
    }

    public void procurarNumero(int numero) {
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numero == numeros[i]) {
                encontrado = true;
                System.out.println("Número encontrado. Posição: " + i);
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado");
        }
    }

    public void mostrarTodos() {
        System.out.println("Lista de todos os números: " + Arrays.toString(numeros));
    }
}
