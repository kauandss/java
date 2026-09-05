package anotacoes.orientacaoaobjetos.metodos.teste;

import anotacoes.orientacaoaobjetos.metodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        /*
                1. Chamada de mét0do com retorno:
             Como 'divideDoisNumeros' retorna um double, podemos armazenar
             o resultado em uma variável para usar depois (resultado).
         */
        double resultado = calculadora.divideDoisNumeros(20,0);
        System.out.println(resultado);

        /*
                2. Chamada de mét0do void que faz a validação interna:
             Não retorna nada para guardar em variável; ele mesmo decide o que imprimir
         */
        calculadora.imprimideDivisaoDeDoisNumeros(86,0);
    }
}
