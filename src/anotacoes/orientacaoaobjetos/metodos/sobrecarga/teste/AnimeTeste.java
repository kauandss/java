package anotacoes.orientacaoaobjetos.metodos.sobrecarga.teste;

import anotacoes.orientacaoaobjetos.metodos.sobrecarga.dominio.Anime;

public class AnimeTeste {
    static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Naruto","TV",12,"Ação");
        anime.imprime();
    }
}
