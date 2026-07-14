package com.example.MeuPrimeiroProjetoJava;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        MaiorNumero numero = new MaiorNumero();
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Primeiro numero: ");
        numero.primeiroNumero = leitor.nextFloat();
        
        System.out.println("Segundo numero: ");
        numero.segundoNumero = leitor.nextFloat();
        
        numero.comprovarMaiorNumero();
    }
}
