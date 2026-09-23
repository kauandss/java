package anotacoes.javacore.Isobrescrita.dominio;

// No Java, TODAS as classes herdam automaticamente da classe 'Object'.
// Escrever "extends Object" é opcional e redundante, pois o compilador já faz isso por padrão.
public class Anime extends Object {
    private String nome;

    /*
        A anotação @Override serve como uma garantia (uma trava de segurança).
        Ela diz ao compilador: "Estou alterando o comportamento de um metodo que existe na classe mãe".
        Se você digitar o nome do metodo errado (ex: tostring()), o @Override fará o código dar erro, avisando que não há o que sobrescrever.
        O comportamento padrão do toString() na classe Object é imprimir o endereço de memória do objeto (ex: Anime@5f150435).
        Aqui, eu sobrescrevi esse metodo para que ele retorne uma string legível mostrando os dados do objeto.
    */
    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
