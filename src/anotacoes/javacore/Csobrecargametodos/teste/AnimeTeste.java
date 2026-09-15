package anotacoes.javacore.Csobrecargametodos.teste;

import anotacoes.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste {
    static void main(String[] args) {
        Anime anime = new Anime();

        /*
            O compilador resolve a chamada para o mét0do init com 4 parâmetros
            (nome, tipo, episodios, genero) devido à assinatura correspondente.
         */
        anime.init("Naruto","TV",12,"Ação");
        anime.imprime(); // Executa a impressão dos valores preenchidos
    }
}
