package anotacoes.javacore.Gassociacao.teste;

import anotacoes.javacore.Gassociacao.dominio.Jogador;
import anotacoes.javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");
        
        jogador1.setTime(time);
        jogador1.imprime();

    }
}
