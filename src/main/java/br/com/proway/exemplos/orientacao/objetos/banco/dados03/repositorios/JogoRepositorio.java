/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.banco.dados03.repositorios;

import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.JogoDao;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 71398
 */
    //Essa classe tem que honrar(implementar)os contratos que estão estipulados na interface
public class JogoRepositorio 
        extends RepositorioBase
        implements JogoRepositorioInterface {   

    @Override
    public int cadastrar(JogoDao jogo) {
        //abrir a conexão
        var conexao = bancoDadosConexao.conectar();
        try {
            var sql = "INSERT INTO jogos (nome, tipo) VALUES (?, ?)";
            var preparador = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparador.setString(1, jogo.getNome());
            preparador.setString(2, jogo.getTipo());
            preparador.execute();

            var registros = preparador.getGeneratedKeys();
            //Verificar se o banco de dados retornou o id gerado
            if (registros.next()) {
                //Retornar o id que foi gerado no banco
                return registros.getInt(1);
            }
            //Retornar -1 para dizer que não foi possível cadastrar
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            //Retornar -1 para dizer que não foi possivel cadastrar
            return -1;

        }
    }

    @Override
    public JogoDao obterPorId(int id) {
        try {
            var conexao = bancoDadosConexao.conectar();
            var sql = "SELECT id, nome, tipo FROM jogos WHERE ID = ?";
            var preparador = conexao.prepareStatement(sql);
            preparador.setInt(1, id);
            preparador.execute();
            var registros = preparador.getResultSet();
            //Verifica se encontrou algum reistro
            if (registros.next()) {
                var jogo = new JogoDao();

                jogo.setId(Integer.parseInt(registros.getString("id")));
                jogo.setNome(registros.getString("nome"));
                jogo.setTipo(registros.getString("tipo"));

                return jogo;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public ArrayList<JogoDao> obterTodos() {
        //Abrir conexão com banco de dados
        var conexao = bancoDadosConexao.conectar();

        var jogos = new ArrayList();
        try {
            var executor = conexao.createStatement();
            var sql = "SELECT id, nome, tipo FROM jogos";
            executor.execute(sql);
            //Obtém a lista de registros consultados da tabela de jogos
            var registros = executor.getResultSet();
            //Percorre cada um dos registros
            while (registros.next()) {
                //Instanciando um objeto de JogoDao
                var jogo = new JogoDao();
                jogo.setId(Integer.parseInt(registros.getString("id")));
                jogo.setNome(registros.getString("nome"));
                jogo.setTipo(registros.getString("tipo"));
                jogos.add(jogo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jogos;
    }

    @Override
    public boolean atualizar(JogoDao jogo) {
        try {
            var conexao = bancoDadosConexao.conectar();
            var sql = "UPDATE jogos SET nome = ?, tipo = ? WHERE id = ?";
            var preparador = conexao.prepareCall(sql);
            preparador.setString(1, jogo.getNome());
            preparador.setString(2, jogo.getTipo());
            preparador.setInt(3, jogo.getId());

            var quantidaeRegistrosAfetados = preparador.executeUpdate();
            if (quantidaeRegistrosAfetados == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean apagar(int id) {
        try {
            var conexao = bancoDadosConexao.conectar();
            var sql = "DELETE FROM jogos WHERE id = ?";
            var preparador = conexao.prepareStatement(sql);
            preparador.setInt(1, id);
            var registrosAfetados = preparador.executeUpdate();
//           1. exemplo: if (registrosAfetados == 1) {
//                return true;
//            }
//            return false;
//        2. exemplo: var apagou = registrosAfetados == 1;
//        return apagou;
            return registrosAfetados == 1;

        } catch (Exception e) {
            return false;
        }

    }

}
