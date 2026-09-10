package anotacoes.orientacaoaobjetos.metodos.sobrecarga.dominio;

public class Anime {

    // Atributos privados garantindo encapsulamento
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    // Versão 1 do init: inicializa os 3 atributos básicos
    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    // Sobrecarga do mét0do init: mesmo nome, porém com assinatura diferente (4 parâmetros).
    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios); // Reaproveita a lógica do mét0do init anterior evitando duplicação de código
        this.genero = genero; // Atribui apenas o dado novo específico desta sobrecarga
    }

    // Exibe o estado completo do objeto no console
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
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
