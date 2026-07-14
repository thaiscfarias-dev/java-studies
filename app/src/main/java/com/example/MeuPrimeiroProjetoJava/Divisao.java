/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MeuPrimeiroProjetoJava;

import static java.lang.Double.NaN;

/**
 *
 * @author DELL
 */
public class Divisao {

    float primeiroNumero;
    float segundoNumero;

    public double Dividir() {
        double resultado;

        if (segundoNumero != 0) {
            resultado = primeiroNumero / segundoNumero;
            return resultado;
        } else {
            return NaN;
        }
    }
}
