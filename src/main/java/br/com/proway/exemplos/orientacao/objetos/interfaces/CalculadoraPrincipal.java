package br.com.proway.exemplos.orientacao.objetos.interfaces;

public class CalculadoraPrincipal {

    public static void main(String[] args) {

        var calculadora = new Calculadora();

        var resultado = calculadora.somar(2, 30);
        var resultadoDivisao = calculadora.dividir(5, 2);
        var ehMaior = calculadora.ehMaior(10, 2);
        var ehMaior2 = calculadora.ehMaior(2, 10);

        System.out.println(
                "Resultado: " + resultado
                + "\nDivisão: " + resultadoDivisao
                + "\nEh maior: " + ehMaior
                + "\nEh maior sendo menor: " + ehMaior2);
    }
}
