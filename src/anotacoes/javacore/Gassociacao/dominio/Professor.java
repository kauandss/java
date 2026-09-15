package anotacoes.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;

    public Professor(String nome) { // Construtor obriga a definir um nome na hora de criar o professor
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
