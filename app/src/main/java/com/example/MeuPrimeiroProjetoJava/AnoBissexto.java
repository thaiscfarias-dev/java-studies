/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MeuPrimeiroProjetoJava;

/**
 *
 * @author DELL
 */
public class AnoBissexto {

    int ano;

    public String verificarAnoBissexto() {

        boolean divPor4;
        divPor4 = ano % 4 == 0;

        boolean divPor100;
        divPor100 = ano % 100 == 0;

        boolean divPor400;
        divPor400 = ano % 400 == 0;

        if ((divPor4 && !divPor100) || divPor400) {
            return "ano bissexto";
        } else {
            return "nao e ano bissexto";
        }

    }

}
