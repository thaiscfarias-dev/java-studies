package com.example.MeuPrimeiroProjetoJava;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Nome nome = new Nome();
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        nome.nome = leitor.next();
        
        System.out.println(nome.cumprimentarPessoa());
 
    }
}
