package anotacoes.javacore.Gassociacao.teste;

import anotacoes.javacore.Gassociacao.dominio.Jogador;
import anotacoes.javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    static void main(String[] args) {

        // 1. Criamos os objetos de forma totalmente independente
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        // 2. Fazemos a ASSOCIAÇÃO acontecer.
        jogador1.setTime(time); // Pegamos o objeto 'time' que criamos acima e guardamos dentro do 'jogador1'.

        // 3. Ao imprimir, o jogador agora sabe dizer em qual time joga.
        jogador1.imprime();
    }
}
