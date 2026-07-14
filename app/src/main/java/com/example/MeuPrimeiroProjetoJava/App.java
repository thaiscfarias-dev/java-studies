package com.example.MeuPrimeiroProjetoJava;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Nome nome = new Nome();
        
        Scanner leitor = new Scanner(System.in);
        
//        System.out.println("Digite seu nome: ");
//        nome.nome = leitor.next();
//        
//        System.out.println(nome.cumprimentarPessoa());
        
        Soma soma = new Soma();
        System.out.println("Vamos somar dois numeros!");
        System.out.println("Digite o primeiro numero: ");
        soma.primeroNumero = leitor.nextFloat();
        
        System.out.println("Digite o segundo numero: ");
        soma.segundoNumero = leitor.nextFloat();
        
        System.out.println("A soma dos dois numeros e: " + soma.somarNumeros());
 
    }
}
