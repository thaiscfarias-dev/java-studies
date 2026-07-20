package com.example.MeuPrimeiroProjetoJava;

import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        try (Scanner scanner = new Scanner(System.in)) {
            
            try{
                System.out.println("Digite um nome: ");
                pessoa.nome = scanner.nextLine();

                System.out.println("Digite uma idade: ");
                pessoa.idade = scanner.nextInt();

                System.out.println("Digite uma altura: ");
                pessoa.altura = scanner.nextDouble();

                pessoa.apresentar();
            
            }catch(InputMismatchException e){
                System.out.println("Entrada inválida");
                scanner.next();
            }
        }
    }
}
