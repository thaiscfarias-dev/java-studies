package com.example.MeuPrimeiroProjetoJava;

public class App {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.nome = "Fulana";
        pessoa.idade = 60;
        pessoa.altura = 1.70;
        
        pessoa.apresentar();
 
    }
}
