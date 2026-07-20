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
public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    
    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresentar() {
        System.out.println("Olá, " + nome);
        System.out.println("Você tem " + idade + " anos");
        System.out.println("Sua altura é: " + altura);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}
