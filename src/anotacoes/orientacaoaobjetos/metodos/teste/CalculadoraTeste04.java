package anotacoes.orientacaoaobjetos.metodos.teste;

import anotacoes.orientacaoaobjetos.metodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 1;
        int num2 = 2;

        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println("---------Dentro CalculadoraTeste04-----------");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
