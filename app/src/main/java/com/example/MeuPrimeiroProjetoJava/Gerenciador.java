/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MeuPrimeiroProjetoJava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Gerenciador {

    private final ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    private int proximoId = 1; // gerador de ID automático

    public void cadastrar() {

        System.out.println("nome: ");
        String nome = scanner.nextLine();

        Usuario novoUsuario = new Usuario(proximoId, nome);
        listaUsuarios.add(novoUsuario);

        System.out.println("cadastrado! ID: " + proximoId);
        proximoId++;
    }

    public void editar() {
        listarTodos();

        if (listaUsuarios.isEmpty()) {
            return;
        }

        System.out.println("digite o ID do usuario que deseja editar: ");
        int idBusca = lerId();

        Usuario usuarioEncontrado = buscarPorId(idBusca);

        if (usuarioEncontrado != null) {
            System.out.println("novo nome: ");
            String novoNome = scanner.nextLine();

            // atualiza os dados do objeto
            usuarioEncontrado.setNome(novoNome);
            System.out.println("atualizado com sucesso!");
        } else {
            System.out.println("usuario nao encontrado");
        }
    }

    public void excluir() {
        listarTodos();

        if (listaUsuarios.isEmpty()) {
            return;
        }

        System.out.println("digite o ID do usuario que deseja excluir: ");
        int idBusca = lerId();

        Usuario usuarioEncontrado = buscarPorId(idBusca);

        if (usuarioEncontrado != null) {
            listaUsuarios.remove(usuarioEncontrado);
            System.out.println("usuario removido com sucesso");
        } else {
            System.out.println("usuario nao encontrado");
        }

    }

    public void listarTodos() {
        if (listaUsuarios.isEmpty()) {
            System.out.println("nenhum usuario cadastrado");
        } else {
            for (Usuario u : listaUsuarios) {
                System.out.println(u);
            }
        }
    }

    private int lerId() {
        while (!scanner.hasNextInt()) {
            System.out.println("digite um ID valido");
            scanner.next();
        }
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }

    private Usuario buscarPorId(int id) {
        for (Usuario u : listaUsuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }
}
