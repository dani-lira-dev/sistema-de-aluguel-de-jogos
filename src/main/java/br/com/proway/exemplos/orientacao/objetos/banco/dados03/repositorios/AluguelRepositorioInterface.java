package br.com.proway.exemplos.orientacao.objetos.banco.dados03.repositorios;

import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.AluguelDao;
import java.util.ArrayList;

interface AluguelRepositorioInterface {

    int adicionar(AluguelDao aluguel);

    boolean atualizar(AluguelDao aluguel);

    boolean apagar(int id);

    ArrayList<AluguelDao> obterTodos();

    AluguelDao obterPorId(int id);
    
    ArrayList<AluguelDao> obterPendentesDevolucao();
    
    void devolver(int aluguelId);
}
