/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.banco.dados03.repositorios;

import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.AluguelDao;
import java.util.ArrayList;

/**
 *
 * @author 71398
 */

//Interface tem como objetivo definir o contrato
interface AluguelRepositorioInterface {
    
    int adicionar (AluguelDao aluguel);
    
    boolean atualizar(AluguelDao aluguel);
    
    boolean apagar(int id);
    
    ArrayList<AluguelDao> obterTodos();
    
    AluguelDao obterPorId(int id);
}
