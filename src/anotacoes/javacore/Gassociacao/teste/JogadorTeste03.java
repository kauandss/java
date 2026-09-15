package anotacoes.javacore.Gassociacao.teste;

import anotacoes.javacore.Gassociacao.dominio.Jogador;
import anotacoes.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    static void main(String[] args) {
        // 1. Criamos os objetos independentes na memória
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");

        // 2. Agrupamos os jogadores criados em um Array
        Jogador[] jogadores = {jogador, jogador2};

        // 3. AMARRANDO A IDA (Jogador -> Time)
        // Avisamos a cada jogador quem é o time dele.
        jogador.setTime(time);
        jogador2.setTime(time);

        // 4. AMARRANDO A VOLTA (Time -> Jogador)
        // Avisamos ao time quem é o elenco dele.
        time.setJogadores(jogadores); // Se esquecermos essa linha, o vínculo não será bidirecional de verdade!

        System.out.println("--- Jogador ---"); // Testando a impressão a partir do Jogador
        jogador.imprime();

        System.out.println("--- Time ---"); // Testando a impressão a partir do Time
        time.imprime();
    }
}
