package anotacoes.javacore.Gassociacao.teste;

import anotacoes.javacore.Gassociacao.dominio.Jogador;
import anotacoes.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
