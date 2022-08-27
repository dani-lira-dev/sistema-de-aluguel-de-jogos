package br.com.proway.exemplos.orientacao.objetos.banco.dados03.servicos;

import br.com.proway.exemplos.orientacao.objetos.banco.dados03.repositorios.JogoRepositorio;
import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.JogoDao;
import java.util.ArrayList;

public class JogoServico implements JogoServicoInterface {

    private JogoRepositorio jogoRepositorio;

    public JogoServico() {
        jogoRepositorio = new JogoRepositorio();
    }

    @Override
    public int adicionar(String nome, String tipo) {
        var jogo = new JogoDao();
        jogo.setNome(nome);
        jogo.setTipo(tipo);

        var id = jogoRepositorio.cadastrar(jogo);

        return id;
    }

    @Override
    public boolean atualizar(int id, String nome, String tipo) {
       var jogo = new JogoDao();
       jogo.setId(id);
       jogo.setNome(nome);
       jogo.setTipo(tipo);
       
       var atualizou = jogoRepositorio.atualizar(jogo);
       
       return atualizou;
    }

    @Override
    public boolean apagar(int id) {
        var apagou = jogoRepositorio.apagar(id);

        return apagou;
    }

    @Override
    public JogoDao obterPorId(int id) {
        var jogo = jogoRepositorio.obterPorId(id);
        
        return jogo;
    }

    @Override
    public ArrayList<JogoDao> obterTodos() {
        var jogos = jogoRepositorio.obterTodos();

        return jogos;
    }
}