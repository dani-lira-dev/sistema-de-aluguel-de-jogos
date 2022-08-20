/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.banco.dados03.servicos;

import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.JogoDao;
import java.util.ArrayList;

/**
 *
 * @author 71398
 */

//
interface JogoServicoInterface {
    
    int adicionar(String nome, String tipo);
    
    boolean atualizar(int id, String nome, String tipo);
    
    boolean apagar (int id);
    
    JogoDao obterPorId(int id);
    
    ArrayList<JogoDao> obterTodos();
}
