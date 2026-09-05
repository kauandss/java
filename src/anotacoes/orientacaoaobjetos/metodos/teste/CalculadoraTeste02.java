package anotacoes.orientacaoaobjetos.metodos.teste;

import anotacoes.orientacaoaobjetos.metodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        /*
         Passagem de argumentos: os valores 20 e 10 são enviados para
         preencher os parâmetros 'int num1' e 'int num2' do mét0do.
         */
        calculadora.multiplicaDoisNumeros(20, 10);
    }
}
