package anotacoes.orientacaoaobjetos.metodos.teste;

import anotacoes.orientacaoaobjetos.metodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    // Curiosidade: o próprio main pode usar varargs (String... args) no lugar de String[] args!
    static void main(String... args) {
        Calculadora calculadora = new Calculadora();

        /*
                1. Array tradicional:
            Exige inicializar o array explicitamente antes de passar
         */

        int[] numeros = {1,2,3,4,5}; // Passa a referência do array criado
        calculadora.somaArray(numeros);
        /*
                2. VarArgs:
            Permite passar os números soltos, separados por vírgula.
            O Java se encarrega de empacotar 1, 2, 3, 4, 5, 6, 7 dentro de um array na memória.
         */

        calculadora.somaVarArgs(1,2,3,4,5,6,7);

        // O VarArgs também aceita arrays já prontos se quiser:
        // calculadora.somaVarArgs(numeros); -> funciona perfeitamente!
    }
}
