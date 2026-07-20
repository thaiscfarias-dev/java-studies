/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MeuPrimeiroProjetoJava;

/**
 *
 * @author DELL
 */
public class ContaBancaria {

    String titular;
    double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso");
        } else {
            System.out.println("Para sacar selecione a opção de saque");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void consultarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo R$ " + saldo);
    }
}
