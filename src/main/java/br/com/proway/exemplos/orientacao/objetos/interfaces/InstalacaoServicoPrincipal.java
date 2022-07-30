/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.proway.exemplos.orientacao.objetos.interfaces;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author 71398
 */
public class InstalacaoServicoPrincipal {
    
    public static void main(String[] args) {
        var instalacaoTv = new Instalacao();
        instalacaoTv.setTipo("TV");
        instalacaoTv.setValor(500.00);
        instalacaoTv.setCliente("Robson");
        instalacaoTv.setDataHoraAgendada(LocalDateTime.of(1982, 5, 4, 1, 37));
        
        var instalacaoPote = new Instalacao();
        instalacaoPote.setTipo("Pote tupperware");
        instalacaoPote.setCliente("Fernanda");
        instalacaoPote.setValor(800.00);
        //Agendada instalação do suporte para o pote de rico(tupperware)
        instalacaoPote.setDataHoraAgendada(
                LocalDate.now().plusDays(1).atTime(12, 42, 56, 23));
        
        //Gerenciar as instalações a fazer
        var instalacaoServico = new InstalacaoServico();
        instalacaoServico.adicionar(instalacaoTv);
        instalacaoServico.adicionar(instalacaoPote);   
        
        System.out.println(
            "Primeira instalação código: " + instalacaoTv.getId()
            + "\nSegunda instalação código: " + instalacaoPote.getId());
        
    }
    
}
