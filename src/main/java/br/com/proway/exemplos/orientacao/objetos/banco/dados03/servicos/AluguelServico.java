/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.banco.dados03.servicos;

import br.com.proway.exemplos.orientacao.objetos.banco.dados03.repositorios.AluguelRepositorio;
import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.JogoDao;
import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.AluguelDao;
import java.util.ArrayList;

/**
 *
 * @author 71398
 */
public class AluguelServico implements AluguelServicoInterface{

    private AluguelRepositorio aluguelRepositorio;
    
    public AluguelServico(){
        aluguelRepositorio = new AluguelRepositorio();
    }
    
    @Override
    public int cadastrar(String cliente, JogoDao jogo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<AluguelDao> obterTodos() {
        var alugueis = aluguelRepositorio.obterTodos();
        
        return alugueis;
    }
    
}
