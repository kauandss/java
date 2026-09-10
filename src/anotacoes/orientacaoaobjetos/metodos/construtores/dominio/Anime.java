package anotacoes.orientacaoaobjetos.metodos.construtores.dominio;

public class Anime {

    // Atributos de instância privados (encapsulamento)
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    // Construtor sobrecarregado (4 parâmetros):
    // Inicializa a maior parte dos dados e delega a execução inicial ao construtor sem argumentos
    public Anime(String nome, String tipo, int episodios, String genero) {
        this(); // Chama o construtor Anime() sem argumentos (deve ser a 1ª linha)
        this.nome = nome;
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    // Construtor completo (5 parâmetros):
    // Encadeia com o construtor de 4 parâmetros, evitando repetição de código
    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero); // Delega as atribuições anteriores (deve ser a 1ª linha)
        this.estudio = estudio; // Inicializa apenas o atributo exclusivo deste construtor
    }

    // Construtor padrão explícito sem argumentos
    public Anime() {
        System.out.println("Dentro do construtor sem argumentos.");
    }

    // Método responsável por imprimir os valores dos atributos do objeto
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    // --- Métodos Getters e Setters ---

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }
}
