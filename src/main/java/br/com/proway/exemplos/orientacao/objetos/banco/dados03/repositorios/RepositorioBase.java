package br.com.proway.exemplos.orientacao.objetos.banco.dados03.repositorios;

import br.com.proway.exemplos.orientacao.objetos.banco.dados03.database.BancoDadosConexao;

public class RepositorioBase {
    protected BancoDadosConexao bancoDadosConexao;
    
    public RepositorioBase(){
        bancoDadosConexao = new BancoDadosConexao();
    }
}

// private: somente dentro da mesma classe    
// protected: somente dentro da mesma classe, ou dentro das classes filhas
// public: acessa em qualquer classe
