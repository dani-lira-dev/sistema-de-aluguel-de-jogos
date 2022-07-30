package br.com.proway.exemplos.orientacao.objetos.interfaces;

public class Calculadora implements CalculadoraInterface {

    @Override
    public int somar(int numero1, int numero2) {
        var soma = numero1 + numero2;

        return soma;
    }

    @Override
    public double dividir(int numero1, int numero2) {
        var divisao = (double) numero1 / numero2;

        return divisao;
    }

    @Override
    public int subtrair(int numero1, int numero2) {
        var subtrai = numero1 - numero2;

        return subtrai;

    }

    @Override
    public int multiplicar(int numero1, int numero2) {
        var multiplica = numero1 * numero2;

        return multiplica;
    }

    @Override
    public boolean ehMaior(int numero1, int numero2) {
        var ehMaior = false;

        if (numero1 > numero2) {
            ehMaior = true;
        } else {
            ehMaior = false;
        }

        return ehMaior;
    }

    @Override
    public boolean ehMenor(int numero1, int numero2) {
        var ehMenor = false;

        if (numero1 < numero2) {
            ehMenor = true;
        } else {
            ehMenor = false;
        }

        return ehMenor;
    }
}
