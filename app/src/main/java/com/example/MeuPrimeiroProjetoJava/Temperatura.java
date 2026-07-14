/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MeuPrimeiroProjetoJava;

/**
 *
 * @author DELL
 */
public class Temperatura {
    
    float celsius;
    
    public double converterTemperatura(){
        double fahrenheit = (celsius * 1.8) + 32;
        return fahrenheit;
    }
    
}
