package anotacoes.orientacaoaobjetos.metodos.teste;

import anotacoes.orientacaoaobjetos.metodos.dominio.Pessoa;

public class PessoaTeste01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa(); // Instanciação do objeto da classe Pessoa

        // Atribuição de valores via métodos modificadores (Setters)
        pessoa.setNome("Kauan");
        pessoa.setIdade(19);

        // Chamada do método que centraliza a lógica de impressão do objeto
        pessoa.imprime();

        // Leitura e recuperação individual dos atributos via métodos de acesso (Getters)
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        /*
            Acoplamento: grau de dependência entre classes.
            O uso de encapsulamento reduz o acoplamento, permitindo alterar a lógica interna
            de 'Pessoa' sem quebrar as chamadas existentes em 'PessoaTeste01'.
         */
    }
}
