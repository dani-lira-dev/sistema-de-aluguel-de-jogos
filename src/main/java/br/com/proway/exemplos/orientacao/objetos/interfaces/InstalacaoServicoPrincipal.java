package br.com.proway.exemplos.orientacao.objetos.interfaces;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstalacaoServicoPrincipal {

    public static void main(String[] args) {
        var instalacaoTv = new Instalacao();
        instalacaoTv.setTipo("TV");
        instalacaoTv.setValor(500.00);
        instalacaoTv.setCliente("Robson");
        instalacaoTv.setDataHoraAgendada(LocalDateTime.of(
                1982, 5, 4, 1, 37));

        var instalacaoPote = new Instalacao();
        instalacaoPote.setTipo("Pote tupperware");
        instalacaoPote.setCliente("Phernanda");
        instalacaoPote.setValor(800);
        // Agendada instalação do suporte para o pote de 
        // rico(tupperware)
        instalacaoPote.setDataHoraAgendada(
                LocalDate.now().plusDays(1).atTime(12, 42, 56, 23));

        // Gerenciar as instalações a fazer
        var instalacaoServico = new InstalacaoServico();
        instalacaoServico.adicionar(instalacaoTv);
        instalacaoServico.adicionar(instalacaoPote);

        System.out.println(
                "Primeira instalação código: " + instalacaoTv.getId()
                + "\nSegunda instalação código: " + instalacaoPote.getId());
    }
}
