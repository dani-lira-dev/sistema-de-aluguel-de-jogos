package br.com.proway.exemplos.orientacao.objetos.banco.dados03.servicos;

import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.JogoDao;
import java.util.ArrayList;

interface JogoServicoInterface {

    int adicionar(String nome, String tipo);

    boolean atualizar(int id, String nome, String tipo);

    boolean apagar(int id);

    JogoDao obterPorId(int id);

    ArrayList<JogoDao> obterTodos();
}
