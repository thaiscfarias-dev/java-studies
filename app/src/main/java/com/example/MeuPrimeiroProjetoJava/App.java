package com.example.MeuPrimeiroProjetoJava;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            
            Menu menu = new Menu(scanner);
            
            Pessoa pessoa = menu.cadastrarPessoa();
            
            pessoa.apresentar();
        }
    }
}
