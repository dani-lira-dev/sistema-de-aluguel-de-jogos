package br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos;

import java.time.LocalDateTime;

//Data Access Object
public class AluguelDao {
    private int id;
    private String cliente;
    private LocalDateTime dataHoraAluguel;
    private LocalDateTime dataHoraDevolucao;
    
    
    @Override
    public String toString(){
        return getCliente() + " - " + getJogo().getNome();
    }
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
