/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.interfaces;

import java.util.ArrayList;

/**
 *
 * @author 71398
 */
public class InstalacaoServico implements InstalacaoServicoInterface {

    private ArrayList<Instalacao> instalacoes;
    private int indiceId;

    // Construtor
    public InstalacaoServico() {
        instalacoes = new ArrayList<Instalacao>();
        indiceId = 0;
    }

    @Override
    public void adicionar(Instalacao instalacao) {
        //Registrar esse serviço de instalação na lista de instalações
        instalacao.setId(++indiceId);

        instalacoes.add(instalacao);
    }

    @Override
    public void editar(Instalacao instalacao) {

    }

    @Override
    public void apagar(int id) {
        for (var instalacao : instalacoes) {
            if (instalacao.getId() == id) {
                //Remove a instalação pois conseguiu encontrar uma instalação com id desejado
                instalacoes.remove(instalacao);
                //return neste caso é utilizado para encerrar o foreach, pois já foi encontrado a instalção com id desejado, ou seja, não deveria existir outra instalação com este id.
                return;
            }
        }
    }

    @Override
    public Instalacao obterPorId(int id) {
        return null;
    }

    @Override
    public ArrayList<Instalacao> obterTodos() {
        return null;
    }

}
