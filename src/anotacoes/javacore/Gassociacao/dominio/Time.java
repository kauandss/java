package anotacoes.javacore.Gassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores; // ASSOCIAÇÃO BIDIRECIONAL: O Time agora guarda uma lista (Array) dos seus jogadores.


    public Time(String nome) { // Construtor: Obriga a dar um nome ao time no momento em que ele for criado
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime(){
        System.out.println(this.nome);

        // Proteção: Se o time não tiver jogadores cadastrados, encerra a impressão aqui.
        if(jogadores == null) return;

        // Se houver jogadores, itera sobre o Array e imprime o nome de cada um.
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
