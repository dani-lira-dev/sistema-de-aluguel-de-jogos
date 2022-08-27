package br.com.proway.exemplos.orientacao.objetos.banco.dados03.repositorios;

import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.JogoDao;
import java.util.ArrayList;

public interface JogoRepositorioInterface {
    // CRUD
    // Create
    int cadastrar(JogoDao jogo);
    // Read
    JogoDao obterPorId(int id);
    ArrayList<JogoDao> obterTodos();
    // Update
    boolean atualizar(JogoDao jogo);
    // Delete
    boolean apagar(int id);
}
