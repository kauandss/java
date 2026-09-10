package anotacoes.orientacaoaobjetos.metodos.construtores.teste;

import anotacoes.orientacaoaobjetos.metodos.construtores.dominio.Anime;

public class AnimeTeste01 {
    static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 15, "Ação","Production IG");
        anime.imprime();
    }
}
