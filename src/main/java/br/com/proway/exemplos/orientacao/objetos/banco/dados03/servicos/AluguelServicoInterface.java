/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.banco.dados03.servicos;

import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.JogoDao;
import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.AluguelDao;
import java.util.ArrayList;

/**
 *
 * @author 71398
 */
interface AluguelServicoInterface {
    int cadastrar(String cliente, JogoDao jogo);

    ArrayList<AluguelDao> obterTodos();
    
}
