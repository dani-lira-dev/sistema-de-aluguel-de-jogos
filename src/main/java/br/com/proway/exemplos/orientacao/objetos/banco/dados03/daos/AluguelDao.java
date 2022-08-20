/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos;

import java.time.LocalDateTime;

/**
 *
 * @author 71398
 */

//Dasta Access Objetct
public class AluguelDao {
    private int id;
    private String cliente;
    private LocalDateTime dataHoraAluguel;
    private LocalDateTime dataHoraDevolucao;
    
    private JogoDao jogo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getDataHoraAluguel() {
        return dataHoraAluguel;
    }

    public void setDataHoraAluguel(LocalDateTime dataHoraAluguel) {
        this.dataHoraAluguel = dataHoraAluguel;
    }

    public LocalDateTime getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    public void setDataHoraDevolucao(LocalDateTime dataHoraDevolucao) {
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    public JogoDao getJogo() {
        return jogo;
    }

    public void setJogo(JogoDao jogo) {
        this.jogo = jogo;
    }
    
}
