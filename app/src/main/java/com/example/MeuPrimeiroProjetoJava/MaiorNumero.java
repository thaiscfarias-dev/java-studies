/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MeuPrimeiroProjetoJava;

/**
 *
 * @author DELL
 */
public class MaiorNumero {

    float primeiroNumero;
    float segundoNumero;

    public void comprovarMaiorNumero() {
        if (primeiroNumero > segundoNumero) {
            System.out.println("o primeiro numero e maior");
        } else {
            if (segundoNumero > primeiroNumero) {
                System.out.println("o segundo numero e maior");
            } else {
                System.out.println("os numeros sao iguais");
            }
        }
    }

}
