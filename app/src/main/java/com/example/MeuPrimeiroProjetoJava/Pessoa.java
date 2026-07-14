/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MeuPrimeiroProjetoJava;

/**
 *
 * como vou calcular o IMC vou deixar apenas as informaçoes referentes ao IMC
 * como peso e altura (atributos)
 */
public class Pessoa {

    // atributos
    float peso;
    float altura;

    // métodos - açoes que a entidade pode ter
    // float é o retorno do meu método
    // nome de método é sempre no infinitivo
    public float calcularIMC() {

        float imc = peso / (altura * altura);
        return imc;
    }
}
