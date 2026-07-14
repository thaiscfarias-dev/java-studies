/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MeuPrimeiroProjetoJava;

/**
 *
 * @author DELL
 */
public class MaiorNumero2 {

    float primeiroNumero;
    float segundoNumero;

    public float verificarMaiorNumero() {
        if (primeiroNumero > segundoNumero) {
            return primeiroNumero;
        } else {
            if (segundoNumero > primeiroNumero) {
                return segundoNumero;
            } else {
                return 0;
            }
        }

    }

}
