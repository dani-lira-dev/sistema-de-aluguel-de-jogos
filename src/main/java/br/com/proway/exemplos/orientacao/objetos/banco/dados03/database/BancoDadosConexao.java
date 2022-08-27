package br.com.proway.exemplos.orientacao.objetos.banco.dados03.database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class BancoDadosConexao {

    public Connection conectar() {
        try {
            var conexao = DriverManager.getConnection(
                    "jdbc:mysql://localhost/locadora", "root", "admin");

            return conexao;
        } catch (Exception e) {
            e.printStackTrace();

            JOptionPane.showMessageDialog(null,
                    "Não foi possível conectar ao banco de dados");
            // Irá encerrar a aplicação, pois não faz sentido 
            // o usuário utilizar senão consegue acessar os dados
            System.exit(0);

            return null;
        }
    }
}
