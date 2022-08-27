package br.com.proway.exemplos.orientacao.objetos.interfaces;

public interface CalculadoraInterface {
    // Contrato que obriga a classe que implementar esta interface
    // a implementar a lógica referente ao método somar
    int somar(int numero1, int numero2);
    double dividir(int numero1, int numero2);
    boolean ehMaior(int numero1, int numero2);
    
    // int subtrair
    // int multiplicar
    // boolean ehMaior
    // boolean ehMenor
}

