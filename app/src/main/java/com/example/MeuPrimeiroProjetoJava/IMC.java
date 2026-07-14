/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MeuPrimeiroProjetoJava;

/**
 *
 * @author DELL
 */
public class IMC {
    float peso;
    float altura;
    
    public double calcularIMC(){
        double imc = peso / (altura * altura);
        return imc;
    }
}
