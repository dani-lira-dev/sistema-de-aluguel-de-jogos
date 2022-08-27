package br.com.proway.exemplos.orientacao.objetos.banco.dados03.servicos;

import br.com.proway.exemplos.orientacao.objetos.banco.dados03.repositorios.AluguelRepositorio;
import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.JogoDao;
import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.AluguelDao;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author 71398
 */
public class AluguelServico implements AluguelServicoInterface {

    private AluguelRepositorio aluguelRepositorio;

    public AluguelServico() {
        aluguelRepositorio = new AluguelRepositorio();
    }

    @Override
    public int cadastrar(String cliente, JogoDao jogo) {
        var aluguel = new AluguelDao();
        aluguel.setJogo(jogo);
        aluguel.setCliente(cliente);
        aluguel.setDataHoraAluguel(LocalDateTime.now());
        
        var id = aluguelRepositorio.adicionar(aluguel);
        
        return id;
    }

    @Override
    public ArrayList<AluguelDao> obterTodos() {
        var alugueis = aluguelRepositorio.obterTodos();

        return alugueis;
    }

    @Override
    public ArrayList<AluguelDao> obterPendentesDevolucao() {
       var alugueisPendentesDevolucao = aluguelRepositorio
               .obterPendentesDevolucao();
       
       return alugueisPendentesDevolucao;
    }

    public void devolver(int id) {
        aluguelRepositorio.devolver(id);
    }
}
