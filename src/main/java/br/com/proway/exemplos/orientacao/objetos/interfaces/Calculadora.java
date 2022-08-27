package br.com.proway.exemplos.orientacao.objetos.interfaces;

public class Calculadora implements CalculadoraInterface {

    @Override
    public int somar(int numero1, int numero2) {
        var soma = numero1 + numero2;

        return soma;
    }

    @Override
    public double dividir(int numero1, int numero2) {
        var resultado = (double) numero1 / numero2;

        return resultado;
    }
    
    @Override
    public boolean ehMaior(int numero1, int numero2){
        boolean maior;
        
        if(numero1 > numero2){
            maior = true;
        }else{
            maior = false;
        }
        
        return maior;
    }
}
