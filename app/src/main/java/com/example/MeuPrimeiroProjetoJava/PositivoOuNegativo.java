/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MeuPrimeiroProjetoJava;

/**
 *
 * @author DELL
 */
public class PositivoOuNegativo {

    float numero;

    public String verificarPositivoOuNegativo() {
        if (numero > 0) {
            return "positivo";
        } else {
            if (numero == 0) {
                return "numero igual a 0";
            } else {
                return "negativo";
            }
        }
    }

}
