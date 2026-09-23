package anotacoes.javacore.Isobrescrita.teste;

import anotacoes.javacore.Isobrescrita.dominio.Anime;

public class AnimeTeste01 {
    static void main(String[] args) {
        Anime anime = new Anime("Dr.Stone"); // Criamos a instância do objeto Anime e passamos o nome "Dr.Stone" para o construtor.

        // Quando você passa uma variável de referência de um objeto diretamente dentro de um System.out.println(),
        // o Java chama automaticamente o metodo toString() daquele objeto nos bastidores.
        // Se eu não tivesse sobrescrito o toString() na classe Anime, isso imprimiria um hash de memória ilegível.
        // Como sobrescrevi, a saída será exatamente o formato que defini: Anime{nome='Dr.Stone'}
        System.out.println(anime);
    }
}
