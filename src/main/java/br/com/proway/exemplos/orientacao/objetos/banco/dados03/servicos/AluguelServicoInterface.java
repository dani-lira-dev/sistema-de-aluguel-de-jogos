package br.com.proway.exemplos.orientacao.objetos.banco.dados03.servicos;

import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.JogoDao;
import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.AluguelDao;
import java.util.ArrayList;

interface AluguelServicoInterface {

    int cadastrar(String cliente, JogoDao jogo);

    ArrayList<AluguelDao> obterTodos();
    
    ArrayList<AluguelDao> obterPendentesDevolucao();
}
