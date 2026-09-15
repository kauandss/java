package anotacoes.javacore.Bintroducaometodos.teste;

import anotacoes.javacore.Bintroducaometodos.dominio.Estudante;

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
