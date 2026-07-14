/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MeuPrimeiroProjetoJava;

/**
 *
 * @author DELL
 */
public class Nota {

    float nota;

    public String aprovarOuReprovarAluno() {

        if (nota >= 7) {
            return "aprovado";
        } else {
            return "reprovado";
        }
    }
}
