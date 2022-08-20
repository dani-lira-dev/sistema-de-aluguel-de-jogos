/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.banco.dados03.repositorios;

import br.com.proway.exemplos.orientacao.objetos.banco.dados03.repositorios.AluguelRepositorioInterface;
import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.JogoDao;
import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.AluguelDao;
import br.com.proway.exemplos.orientacao.objetos.banco.dados03.repositorios.AluguelRepositorioInterface;
import java.util.ArrayList;

/**
 *
 * @author 71398
 */
public class AluguelRepositorio
        extends RepositorioBase
        implements AluguelRepositorioInterface {

    @Override
    public int adicionar(AluguelDao aluguel) {
        try {
            var conexao = bancoDadosConexao.conectar();
            var sql = " INSERT INTO alugueis (cliente, data_hora_aluguel, id_jogo) VALUES (?, ?, ?)";
            var preparador = conexao.prepareStatement(sql);
            preparador.setString(1, aluguel.getCliente());
            preparador.setString(2, aluguel.getDataHoraAluguel().toString());
            preparador.setString(3, String.valueOf(aluguel.getJogo().getId()));
            preparador.execute();
            var registros = preparador.getResultSet();
            if (registros.next()) {
                var id = Integer.parseInt(registros.getString(0));
                return id;
            }

            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

    }

    @Override
    public boolean atualizar(AluguelDao aluguel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean apagar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<AluguelDao> obterTodos() {
        try {
            var alugueis = new ArrayList<AluguelDao>();
            
            var conexao = bancoDadosConexao.conectar();
            var sql = """ 
                      SELECT 
                          alu.id AS 'aluno_id',
                          alu.cliente AS 'aluno_cliente',
                          jog.nome AS 'jogo_nome',
                          jog.id AS 'jogo_id',
                          alu.data_hora_aluguel AS 'aluno_data_hora_aluguel',
                          alu.data_hora_devolucao AS 'aluno_data_hora_devolucao'
                      FROM
                      alugueis AS alu
                      INNER JOIN jogos AS jog ON (alu.id_jogo = jog.id)""";
            var executor = conexao.createStatement();
            executor.execute(sql);
            
            var registros = executor.getResultSet();
            while(registros.next()){
                var aluguel = new AluguelDao();
                aluguel.setId(Integer.parseInt(registros.getString("aluno_id")));
                aluguel.setCliente(registros.getString("aluno_cliente"));
                //aluguel.setDataHoraAluguel(LocalDateTime.of);
                //aluguel.setDataHoraDevolucao();
                
                var jogo = new JogoDao();
                jogo.setId(Integer.parseInt(registros.getString("jogo_id")));
                jogo.setNome(registros.getString("jog_nome"));
                aluguel.setJogo(jogo);
                
                alugueis.add(aluguel);
            }
            
            return alugueis;
        } catch (Exception e) {
            e.printStackTrace();

            return new ArrayList<AluguelDao>(0);
        }
    }

    @Override
    public AluguelDao obterPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
