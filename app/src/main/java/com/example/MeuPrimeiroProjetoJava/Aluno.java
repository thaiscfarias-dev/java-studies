/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MeuPrimeiroProjetoJava;

/**
 *
 * @author DELL
 */
public class Aluno {

    String nome;
    float nota1;
    float nota2;
    private float media;

    public void calcularMedia() {
        media = (nota1 + nota2) / 2;
        System.out.println("A média do aluno é: " + media);
    }

    public void aprovado() {
        System.out.println("Nome do aluno: " + nome);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

}
