package anotacoes.orientacaoaobjetos.blocosdeinicializacao.teste;

import anotacoes.orientacaoaobjetos.blocosdeinicializacao.dominio.Anime;

public class AnimeTeste01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
