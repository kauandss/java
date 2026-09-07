package anotacoes.orientacaoaobjetos.metodos.teste;

import anotacoes.orientacaoaobjetos.metodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Variáveis originais criadas na memória do mét0do main:
        int num1 = 1;
        int num2 = 2;

        // Passamos apenas os VALORES (1 e 2), não a variável em si:
        calculadora.alteraDoisNumeros(num1,num2);

        // O mét0do já encerrou e alterou apenas as cópias dele:
        System.out.println("---------Dentro CalculadoraTeste04-----------");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
