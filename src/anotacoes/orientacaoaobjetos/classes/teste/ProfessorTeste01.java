package anotacoes.orientacaoaobjetos.classes.teste;

import anotacoes.orientacaoaobjetos.classes.dominio.Professor;

public class ProfessorTeste01 {
    static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Vitão";
        professor.idade = 56;
        professor.sexo = 'M';

        System.out.println("nome: " + professor.nome + "\n idade: " + professor.idade + "\n sexo: " + professor.sexo);
    }
}
