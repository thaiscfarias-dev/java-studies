/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MeuPrimeiroProjetoJava;

/**
 *
 * @author DELL
 */
public class ParOuImpar {
    
    float numero;
    
    public String verificarParOuImpar(){
        float resto = numero % 2;
        
        if(resto == 0) {
            return "o numero " + numero + " e par";
        } else {
            return "o numero " + numero + " e impar";
        }
    }
    
}
