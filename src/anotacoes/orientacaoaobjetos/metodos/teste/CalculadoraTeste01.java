package anotacoes.orientacaoaobjetos.metodos.teste;

import anotacoes.orientacaoaobjetos.metodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    static void main(String[] args) {

        // Instanciação: cria um objeto do tipo Calculadora na memória
        Calculadora calculadora = new Calculadora();

        // Chamada de métodos simples: não enviam dados e não esperam retorno
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
    }
}
