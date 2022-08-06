/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.banco.dados03;

import java.util.ArrayList;

/**
 *
 * @author 71398
 */
public interface JogoRepositorioInterface {
    //CRUD
    // Create
    int cadastrar(JogoDao jogo);
    // Read
    JogoDao obterPorId(int id);
    ArrayList<JogoDao> obterTodos();
    //Update
    boolean atualizar (JogoDao jogo);
    //Delete
    boolean apagar(int id);
}
