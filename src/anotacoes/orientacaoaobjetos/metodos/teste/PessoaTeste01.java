package anotacoes.orientacaoaobjetos.metodos.teste;

import anotacoes.orientacaoaobjetos.metodos.dominio.Pessoa;

public class PessoaTeste01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Kauan");
        pessoa.setIdade(19);
        pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        // Acoplamento: é o quão uma classe está conectada com outra.

    }
}
