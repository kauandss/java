package anotacoes.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;

    // ASSOCIAÇÃO 1 PARA N: Uma escola tem VÁRIOS professores.
    private Professor[] professores; // Usamos o Array [] para guardar essa lista.


    public Escola(String nome) { // Construtor 1: Cria a escola apenas com o nome (ainda sem professores)
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) { // Construtor 2: Cria a escola já recebendo o nome e a lista de professores de uma vez
        this.professores = professores;
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);

        // Se a escola ainda não tiver nenhum professor cadastrado, o mét0do para por aqui (return)
        // Isso evita o erro de tentar ler uma lista vazia (NullPointerException)
        if(professores == null) return;
        for (Professor professor : professores) { // Laço (foreach): Para cada 'professor' dentro do array 'professores', imprima o nome
            System.out.println(professor.getNome());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
