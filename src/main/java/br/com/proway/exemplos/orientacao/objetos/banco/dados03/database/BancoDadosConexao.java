/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.banco.dados03.database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author 71398
 */
public class BancoDadosConexao {    
    public Connection conectar(){
        try{
            var conexao = DriverManager.getConnection("jdbc:mysql://localhost/lojaBd", "root", "admin");
            return conexao;
        }catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados");
            //Irá encerrar a apalicação, pois não faz sentido o usuário utiliza senãp consegue acessar os dados
            System.exit(0);
            
            return null;
        }
    }
}
