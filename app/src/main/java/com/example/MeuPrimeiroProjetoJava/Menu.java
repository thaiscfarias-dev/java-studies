/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Menu {

    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public Pessoa cadastrarPessoa() {
        System.out.println("Digite um nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite uma idade: ");
        int idade = lerIdade(scanner);

        System.out.println("Digite uma altura: ");
        double altura = lerAltura(scanner);

        return new Pessoa(nome, idade, altura);
    }

    private int lerIdade(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Idade inválida. Digite novamente: ");
                scanner.next();
            }
        }
    }

    private double lerAltura(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Altura inválida. Digite novamente: ");
                scanner.next();
            }
        }
    }

}
