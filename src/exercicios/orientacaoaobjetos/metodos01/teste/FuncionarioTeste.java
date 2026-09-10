package exercicios.orientacaoaobjetos.metodos01.teste;

import exercicios.orientacaoaobjetos.metodos01.dominio.Funcionario;

public class FuncionarioTeste {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Kauan");
        funcionario.setIdade(19);
        funcionario.setSalarios(new double[]{2500, 3000.50, 2760});

        funcionario.imprime();
        System.out.println("Média: "+ funcionario.getMedia());

    }
}
