/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MeuPrimeiroProjetoJava;

/**
 *
 * @author DELL
 */
  

    public class Pessoa {

        String nome;
        int idade;
        double altura;

        public void apresentar() {
            System.out.println("Olá, " + nome);
            System.out.println("Você tem " + idade + " anos");
            System.out.println("Sua altura é: " + altura);
        }
    }

