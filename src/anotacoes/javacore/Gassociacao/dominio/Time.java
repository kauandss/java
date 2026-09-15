package anotacoes.javacore.Gassociacao.dominio;

public class Time {
    private String nome;


    public Time(String nome) { // Construtor: Obriga a dar um nome ao time no momento em que ele for criado
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
