package exercicios.orientacaoaobjetos.metodos01.teste;

import exercicios.orientacaoaobjetos.metodos01.dominio.Funcionario;

public class FuncionarioTeste {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Kauan";
        funcionario.idade = 19;
        funcionario.salarios = new double[]{2500, 3000.50, 2760};

        funcionario.imprime();

    }
}
