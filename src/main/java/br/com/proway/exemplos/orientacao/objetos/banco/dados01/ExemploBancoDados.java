/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.banco.dados01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author 71398
 */
public class ExemploBancoDados {

    public static void main(String[] args) {
        try {
            Connection conexao = DriverManager
                    .getConnection(
                            "jdbc:mysql://localhost:3306/lojaBd",
                            "root",
                            "admin");
            System.out.println("Conexão aberta com sucesso");
            
//            Statement executor = conexao.createStatement();
//            executor.execute(
//                    "INSERT INTO carros (modelo, marca, preco)" + 
//                        "VALUES ('Kombi','VW', 52000)");
//            System.out.print("Registro criado com sucesso");

//            Statement executor = conexao.createStatement();
//            executor.execute("DELETE FROM carros WHERE id = 1");
//            System.out.print("Registro criado com sucesso");
            
// CRUD Create(INSERT), READ(SELECT), UPDATE(UPDATE), DELETE(DELETE)
    
//            Statement executor = conexao.createStatement();
//            executor.execute(
//                    "UPDATE carros SET modelo = 'Fiat uno tunado com escada', "
//                        + "marca = 'Fiat' WHERE id = 3");
//            System.out.print("Registro atualizado com sucesso");
//            
                Statement executor = conexao.createStatement();
                executor.execute("SELECT id, modelo, marca, preco FROM carros");
                
                //Obter os dadso da cconsulta para no JAVA
                ResultSet registros = executor.getResultSet();
                
                while(registros.next()){
                    int id = Integer.parseInt(registros.getString("id"));
                    String modelo = registros.getString("modelo");
                    String marca = registros.getNString("marca");
                    double preco = Double.parseDouble(registros.getString("preco"));
                    System.out.println(
                            "Código: " + id +
                                    " - Modelo: " + modelo + 
                                    " - Marca: " + marca +
                                    " - Preço: " + preco + "\n");
                }

        } catch (Exception ex) {
            ex.printStackTrace();
            System.err.println("Não foi possível conectar");
        }
    }
}

