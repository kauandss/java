package anotacoes.orientacaoaobjetos.metodos.teste;

import anotacoes.orientacaoaobjetos.metodos.dominio.Estudante;
import anotacoes.orientacaoaobjetos.metodos.dominio.ImpressoraEstudante;

public class EstudanteTeste02 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Kauan";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Dalila";
        estudante02.idade = 45;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
