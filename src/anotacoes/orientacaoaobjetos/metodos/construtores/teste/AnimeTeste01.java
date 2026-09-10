package anotacoes.orientacaoaobjetos.metodos.construtores.teste;

import anotacoes.orientacaoaobjetos.metodos.construtores.dominio.Anime;

public class AnimeTeste01 {
    static void main(String[] args) {

        /*
            Ao instanciar com 5 argumentos, ocorre a seguinte cadeia de execução:
                1. O construtor de 5 argumentos chama this(...) de 4 argumentos;
                2. O construtor de 4 argumentos chama this() sem argumentos;
                3. Imprime "Dentro do construtor sem argumentos.";
                4. Executa as atribuições pendentes de volta na pilha de chamadas.
         */
        Anime anime = new Anime("Naruto", "TV", 15, "Ação","Production IG");
        anime.imprime(); // Imprime todas as informações encapsuladas no objeto
    }
}
