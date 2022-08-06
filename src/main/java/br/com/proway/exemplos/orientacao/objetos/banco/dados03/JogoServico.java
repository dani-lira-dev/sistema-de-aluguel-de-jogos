/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.banco.dados03;

/**
 *
 * @author 71398
 */
public class JogoServico {
    public static void main(String[] args) {
        var jogoRepositorio = new JogoRepositorio();
        
        var jogo = new JogoDao();
        jogo.setNome("Jogo da vida");
        jogo.setTipo("Dificuldade máximo");
        
        var idGerado = jogoRepositorio.cadastrar(jogo);
        System.out.println("id gerado: " + idGerado);
    }
}
