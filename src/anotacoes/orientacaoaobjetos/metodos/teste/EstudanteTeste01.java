package anotacoes.orientacaoaobjetos.metodos.teste;

import anotacoes.orientacaoaobjetos.metodos.dominio.Estudante;
import anotacoes.orientacaoaobjetos.metodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        
        estudante01.nome = "Kauan";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Dalila";
        estudante02.idade = 45;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

        System.out.println("------------------");

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);
    }
}
