/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MeuPrimeiroProjetoJava;

/**
 *
 * @author DELL
 */
public class Triangulo {

    float lado1;
    float lado2;
    float lado3;

    public boolean verificarSeTrianguloExiste() {
        boolean triangulo = (lado1 + lado2 > lado3)
                && (lado1 + lado3 > lado2)
                && (lado2 + lado3 > lado1);

        return triangulo;
    }

    public String verificarTipoTriangulo() {

        boolean equilatero = (lado1 == lado2) && (lado1 == lado3);
        boolean isosceles = lado1 == lado2 || lado1 == lado3 || lado2 == lado3;

        if (equilatero == true) {
            return "equilatero";
        } else if (isosceles == true) {
            return "isosceles";
        } else {
            return "escaleno";
        }
    }
}
