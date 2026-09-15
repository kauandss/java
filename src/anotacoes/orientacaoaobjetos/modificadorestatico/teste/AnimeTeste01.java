package anotacoes.orientacaoaobjetos.modificadorestatico.teste;

import anotacoes.orientacaoaobjetos.modificadorestatico.dominio.Anime;

public class AnimeTeste01 {
    static void main(String[] args) {

        // Ao ver a classe Anime pela 1ª vez, a JVM carrega a classe.
        // NESTE MOMENTO, os 3 blocos 'static' da classe Anime são executados.

        // Em seguida, o objeto anime1 é criado: roda o bloco não-estático, depois o construtor.
        Anime anime1 = new Anime();

        // Ao criar o anime2, os blocos 'static' NÃO rodam mais (a classe já foi carregada).
        // Roda apenas o bloco não-estático e o construtor.
        Anime anime2 = new Anime();

        // Mesma coisa para o anime3: roda apenas o bloco não-estático e o construtor.
        Anime anime3 = new Anime();


    }
}
