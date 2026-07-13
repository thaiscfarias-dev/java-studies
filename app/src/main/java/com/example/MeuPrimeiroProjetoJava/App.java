/*
 * Isso é um comentário de bloco
 * quando eu preciso de várias linhas
 * assim nao preciso digitar várias barras
 */

/* 
 minha primeira linha de comentário
    Veja que aqui eu também comento
        e não preciso de colocar asterisco em cada linha
            gostou?
esse tipo de comentário não vai para o java doc
*/

/** veja que inicia com 2 asteriscos ao invés de um
isso é um comentário de documentação que 
* permite que vire um documento para
* uma pessoa consultar
* quando dou enter
* um novo asterisco aparece
* esse comentário iria para um documento
* quando o código é muito grande 
* outro dev pode consultar 
* esse tipo de comentário vai para o java doc
*/
package com.example.MeuPrimeiroProjetoJava;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        // Isso é um comentário
        // basta colocar duas barras
        System.out.println(new App().getGreeting());
    }
}
