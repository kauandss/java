package anotacoes.orientacaoaobjetos.blocosdeinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    // 1 - Alocado espaço em memória pro objeto;
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado;
    // 3 - Bloco de inicialização é executado;
    // 4 - Construtor é executado.

    /*
     * BLOCO DE INICIALIZAÇÃO DE INSTÂNCIA
     * Ele é executado toda vez que um 'new Anime()' é chamado.
     * Sua principal função aqui é garantir que a lógica de preenchimento
     * dos episódios ocorra para TODOS os objetos, independente de qual
     * construtor seja chamado logo em seguida.
     */
    {
        System.out.println("Dentro do bloco de inicialização.");
        episodios = new int[100];

        // Preenche o array: o índice 0 recebe o episódio 1, o índice 1 recebe o 2, etc.
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    // Construtor 1: Recebe o nome do anime
    public Anime(String nome) {
        // Quando a execução chega aqui, o bloco de inicialização lá em cima JÁ RODOU.
        // Ou seja, o array 'episodios' já está criado e preenchido com 100 posições.
        this.nome = nome;
    }

    // Construtor 2: Sem parâmetros
    public Anime() {

        // Novamente, o bloco de inicialização já rodou antes de chegar aqui.
        // Por isso, podemos iterar sobre 'this.episodios' sem tomar um erro de NullPointerException.
        for (int episodios : this.episodios) {
            System.out.println(episodios + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
