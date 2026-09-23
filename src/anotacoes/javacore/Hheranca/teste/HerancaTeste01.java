package anotacoes.javacore.Hheranca.teste;

import anotacoes.javacore.Hheranca.dominio.Endereco;
import anotacoes.javacore.Hheranca.dominio.Funcionario;
import anotacoes.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("01050-035");
        Pessoa pessoa = new Pessoa("Kauan");
        pessoa.setCpf("113.431.243-02");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Sara");
        funcionario.setCpf("254.615.321-04");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        System.out.println("------------");
        funcionario.imprime();

    }
}
