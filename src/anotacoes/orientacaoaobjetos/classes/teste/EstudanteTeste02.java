package anotacoes.orientacaoaobjetos.classes.teste;

import anotacoes.orientacaoaobjetos.classes.dominio.Estudante;

public class EstudanteTeste02 {
    static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Kauan";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("\n---------------------------\n");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
