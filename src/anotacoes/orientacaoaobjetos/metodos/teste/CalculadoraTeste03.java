package anotacoes.orientacaoaobjetos.metodos.teste;

import anotacoes.orientacaoaobjetos.metodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20,0);
        System.out.println(resultado);
        calculadora.imprimideDivisaoDeDoisNumeros(86,0);
    }
}
