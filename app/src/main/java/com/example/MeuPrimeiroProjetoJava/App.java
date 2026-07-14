package com.example.MeuPrimeiroProjetoJava;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {
            /* exibir o nome do usuário */
            Nome nome = new Nome();
            
            System.out.println("Digite seu nome: ");
            nome.nome = leitor.nextLine();

            System.out.println(nome.cumprimentarPessoa());

            /* soma de dois numeros */
            Soma soma = new Soma();
            System.out.println("Vamos somar dois numeros!");
            System.out.println("Digite o primeiro numero: ");
            soma.primeroNumero = leitor.nextFloat();

            System.out.println("Digite o segundo numero: ");
            soma.segundoNumero = leitor.nextFloat();

            System.out.println("A soma dos dois numeros e: " + soma.somarNumeros());

            /* média de dois numeros */
            Media media = new Media();
            System.out.println("Vamos calcular a media de dois numeros!");
            System.out.println("Digite o primeiro numero: ");
            media.primeroNumero = leitor.nextFloat();

            System.out.println("Digite o segundo numero: ");
            media.segundoNumero = leitor.nextFloat();

            System.out.println("A media dos dois numeros e: " + media.calcularMedia());

            /* conversão de Celsius para Fahrenheit */
            Temperatura temperatura = new Temperatura();
            System.out.println("Qual temperatura em Celsius voce deseja converter? ");

            temperatura.celsius = leitor.nextFloat();
            System.out.println("A temperatura em Fahrenheit e: "
                    + temperatura.converterTemperatura());
        }
    }
}
