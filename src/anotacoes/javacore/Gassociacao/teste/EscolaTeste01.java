package anotacoes.javacore.Gassociacao.teste;

import anotacoes.javacore.Gassociacao.dominio.Escola;
import anotacoes.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    static void main(String[] args) {
        Professor professor1 = new Professor("Vitão");
        Professor professor2 = new Professor("Grace");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("FATEC-SP", professores);

        escola.imprime();
    }
}
