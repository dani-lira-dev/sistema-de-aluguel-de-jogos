package br.com.proway.exemplos.orientacao.objetos.interfaces;

import java.util.ArrayList;

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
        // Registrar este serviço de instalação na lista de 
        // instalações
        
        instalacao.setId(++indiceId);
        
        instalacoes.add(instalacao);
    }

    @Override
    public void editar(Instalacao instalacao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagar(int id) {
        // Percorrer a lista de instalações para remover 
        // a instalação com o id desejado
        for(var instalacao : instalacoes){
            if(instalacao.getId() == id){
                // Remove a instalação pois conseguiu encontrar
                // uma instalação com o id desejado
                instalacoes.remove(instalacao);
                // return neste caso é utilizado para encerrar 
                // o foreach, pois já foi encontrado a instalação 
                // com o id desejado, ou seja, não deveria existir 
                // outra instalação com este id.
                return;
            }
        }
    }

    @Override
    public Instalacao obterPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Instalacao> obterTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
