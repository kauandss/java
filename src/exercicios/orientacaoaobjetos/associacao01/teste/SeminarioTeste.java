package exercicios.orientacaoaobjetos.associacao01.teste;

import exercicios.orientacaoaobjetos.associacao01.dominio.Aluno;
import exercicios.orientacaoaobjetos.associacao01.dominio.Local;
import exercicios.orientacaoaobjetos.associacao01.dominio.Professor;
import exercicios.orientacaoaobjetos.associacao01.dominio.Seminario;

public class SeminarioTeste {
    static void main(String[] args) {
        Local local = new Local("Av. Tiradentes, 615 - Bom Retiro, São Paulo");
        Professor professor = new Professor("William", "Programação");
        Aluno aluno1 = new Aluno("Kauan", 19);
        Aluno aluno2 = new Aluno("Vinicius", 20);
        Seminario seminario = new Seminario("Associação", local);

        Aluno[] alunos = {aluno1, aluno2};
        Seminario[] seminarios = new Seminario[]{seminario};

        seminario.setAlunos(alunos);
        professor.setSeminarios(seminarios);
        aluno1.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        professor.imprimir();

    }
}
