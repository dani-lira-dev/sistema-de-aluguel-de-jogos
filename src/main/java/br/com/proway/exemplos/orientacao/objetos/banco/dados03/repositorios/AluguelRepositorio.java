package br.com.proway.exemplos.orientacao.objetos.banco.dados03.repositorios;

import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.JogoDao;
import br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos.AluguelDao;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class AluguelRepositorio
        extends RepositorioBase
        implements AluguelRepositorioInterface {

    @Override
    public int adicionar(AluguelDao aluguel) {
        try {
            var conexao = bancoDadosConexao.conectar();
            var sql = "INSERT INTO alugueis (cliente, data_hora_aluguel, id_jogo) VALUES (?, ?, ?)";
            var preparador = conexao.prepareStatement(sql, 
                    PreparedStatement.RETURN_GENERATED_KEYS);
            preparador.setString(1, aluguel.getCliente());
            preparador.setString(2, aluguel
                    .getDataHoraAluguel().toString());
            preparador.setString(3, String.valueOf(aluguel
                    .getJogo().getId()));
            preparador.execute();
            var registros = preparador.getGeneratedKeys();
            if (registros.next()) {
                var id = registros.getInt(1);
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
                          FROM alugueis AS alu
                      INNER JOIN jogos AS jog ON(alu.id_jogo = jog.id)""";
            var executor = conexao.createStatement();
            executor.execute(sql);
            
            var registros = executor.getResultSet();
            while(registros.next()){
                var aluguel = new AluguelDao();
                aluguel.setId(Integer.parseInt(registros
                        .getString("aluno_id")));
                aluguel.setCliente(registros.getString("aluno_cliente"));
                
                var formatador = LocalDateFormatter
                        .ofPattern("yyyy-MM_dd hh:mm:ss");
                        
                aluguel.setDataHoraAluguel(LocalDateTime.from(temporal));
                    .from(formatador.parse);
                var jogo = new JogoDao();
                jogo.setId(Integer.parseInt(registros.getString("jogo_id")));
                jogo.setNome(registros.getString("jogo_nome"));
                aluguel.setJogo(jogo);
                
                alugueis.add(aluguel);
            }
            return alugueis;
        } catch (Exception e) {
            e.printStackTrace();

            return new ArrayList<AluguelDao>();
        }
    }

    @Override
    public AluguelDao obterPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<AluguelDao> obterPendentesDevolucao() {
       try{
           var conexao = bancoDadosConexao.conectar();
           var sql = """
                     SELECT 
                     a.ID as 'id',
                     j.nome AS 'nome'
                     a.cliente AS 'cliente'
                     FROM alugueis AS a 
                     INNER JOIN jogos AS j ON (j.id = a.id_jogo)
                     WHERE data_hora_devolucao IS NULL
                     """;
           var executor = conexao.createStatement();
           executor.execute(sql);
           var tabelaEmMemoria = executor.getResultSet();
           
           var alugueis = new ArrayList<AluguelDao>();
           
           while(tabelaEmMemoria.next()){
               var aluguelDao = new AluguelDao();
               aluguelDao.setId(Integer.parseInt(
                tabelaEmMemoria.getString("id")));
               var jogo = new JogoDao();
               jogo.setNome(tabelaEmMemoria.getString("nome"));
               aluguelDao.setJogo(jogo);
               
               aluguelDao.setCliente(tabelaEmMemoria
                .getString("cliente"));
               
               alugueis.add(aluguelDao);
           }
           
           return alugueis;
           
       }catch(Exception e){
           
       }
       return new ArrayList<>();
    }
    
    @Override
    public void devolver(int aluguelId){
        try{ 
            var conexao = bancoDadosConexao.conectar();
            var sql = """
                      UPDATE alugueis
                      SET data_hora_devolucao = ?
                      WHERE id = ?
                      """;
            var preparador = conexao.prepareStatement(sql);
            preparador.setInt(2, aluguelId);
            //preencher data
            preparador.setDate(1, Date.valueOf(LocalDate.now()));
            preparador.executeUpdate();
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
