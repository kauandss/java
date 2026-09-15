package anotacoes.javacore.Eblocosdeinicializacao.teste;

import anotacoes.javacore.Eblocosdeinicializacao.dominio.Anime;

public class AnimeTeste01 {
    static void main(String[] args) {

        // Quando eu faço 'new Anime()', o Java segue os passos:
        // 1. Cria o espaço na memória.
        // 2. Chama o Bloco de Inicialização de Instância (imprime a mensagem e preenche o array de 100 posições).
        // 3. Chama o Construtor Anime() vazio (que imprime todos os episódios na mesma linha).
        Anime anime = new Anime();

        // Aqui estou pegando o array que JÁ foi criado pelo bloco de inicialização
        // e imprimindo ele novamente no console.
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
