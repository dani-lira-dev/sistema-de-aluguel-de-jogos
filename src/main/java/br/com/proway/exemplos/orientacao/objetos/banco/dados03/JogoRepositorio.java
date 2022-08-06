/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.banco.dados03;

import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 71398
 */
public class JogoRepositorio implements JogoRepositorioInterface{
    //Aqui o banco só está idealizado
    private BancoDadosConexao bancoDadosConexao;
    
    // Ele só se torna "real" com um construtor, sem isso o retorno NullPointerException. 
    //Construtor:definir informações primordiais
    public JogoRepositorio() {
        bancoDadosConexao = new BancoDadosConexao();
    }

    @Override
    public int cadastrar(JogoDao jogo) {
        //abrir a conexão
        var conexao = bancoDadosConexao.conectar();
        try{
            var sql = "INSERT INTO jogos (nome, tipo) VALUES (?, ?)";
            var preparador = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparador.setString(1, jogo.getNome());
            preparador.setString(2, jogo.getTipo());
            preparador.execute();
            
            var registros = preparador.getGeneratedKeys();
            //Verificar se o banco de dados retornou o id gerado
            if(registros.next()){
                //Retornar o id que foi gerado no banco
                return registros.getInt(1);
            }
            //Retornar -1 para dizer que não foi possível cadastrar
            return -1;
        }catch (Exception e) {
            e.printStackTrace();
            //Retornar -1 para dizer que não foi possivel cadastrar
            return -1;
            
        }
    }

    @Override
    public JogoDao obterPorId(int id) {
        
    }

    @Override
    public ArrayList<JogoDao> obterTodos() {
        //Abrir conexão com banco de dados
        var conexao = bancoDadosConexao.conectar();
        
        var jogos = new ArrayList();
        try{
            var executor = conexao.createStatement();
            var sql = "SELECT id, nome, tipo FROM jogos";
            executor.execute(sql);
            //Obtém a lista de registros consultados da tabela de jogos
            var registros = executor.getResultSet();
            //Percorre cada um dos registros
            while(registros.next()){
                //Instanciando um objeto de JogoDao
                var jogo = new JogoDao();
                jogo.setId(Integer.parseInt(registros.getString("id")));
                jogo.setNome(registros.getString("nome"));
                jogo.setTipo(registros.getString("tipo"));
                jogos.add(jogo);
            }
            }catch (Exception e) {
            e.printStackTrace();            
        }
        return jogos;
    }

    @Override
    public boolean atualizar(JogoDao jogo) {
        
    }

    @Override
    public boolean apagar(int id) {
        
    }
    
}
