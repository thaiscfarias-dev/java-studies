package com.example.MeuPrimeiroProjetoJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {

            Nota nota = new Nota();
            boolean tentarNovamente = true;

            while (tentarNovamente) {
                
                try{
                    System.out.println("digite sua nota: ");
                    nota.nota = leitor.nextFloat();

                    System.out.println(nota.aprovarOuReprovarAluno());
                    tentarNovamente = false;
                
                }catch (InputMismatchException e){
                    System.out.println("entrada invalida. Tente novamente");
                    /** Quando usamos o leitor.next() dentro do catch, 
                     * nós estamos dizendo ao Java para limpar a entrada anterior
                     para limpar o teclado
                     */
                    leitor.next();
                }

            }

        }

    }
}
