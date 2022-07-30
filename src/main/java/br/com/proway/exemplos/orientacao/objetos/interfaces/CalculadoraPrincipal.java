package br.com.proway.exemplos.orientacao.objetos.interfaces;

public class CalculadoraPrincipal {

    public static void main(String[] args) {

        var calculadora = new Calculadora();

        var resultado = calculadora.somar(2, 30);
        var resultadoDivisao = calculadora.dividir(10, 5);
        var resultadoSubtrair = calculadora.subtrair(7, 2);
        var resultadoMultiplicacao = calculadora.multiplicar(6, 3);
        var resultadoEhMaior = calculadora.ehMaior(10, 5);
        var resultadoEhMenor = calculadora.ehMenor(10, 5);

        System.out.println(
                "Resultado: " + resultado
                + "\nDivisão: " + resultadoDivisao
                + "\nSubtração: " + resultadoSubtrair
                + "\nSoma: " + resultado
                + "\nMultiplicação: " + resultadoMultiplicacao
                + "\nEhMaior: " + resultadoEhMaior
                + "\nEhMenor: " + resultadoEhMenor);

    }
}
