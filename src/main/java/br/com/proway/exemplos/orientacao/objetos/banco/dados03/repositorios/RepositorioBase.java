/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.banco.dados03.repositorios;

import br.com.proway.exemplos.orientacao.objetos.banco.dados03.database.BancoDadosConexao;

/**
 *
 * @author 71398
 */
public class RepositorioBase {
   protected BancoDadosConexao bancoDadosConexao;
   
   public RepositorioBase(){
       bancoDadosConexao = new BancoDadosConexao();
   }
}
