package anotacoes.javacore.Jmodificadorfinal.dominio;

// Se a classe Carro tivesse o modificador 'final' (ex: public final class Carro),
// ela não poderia ser herdada. Nenhuma outra classe poderia fazer "extends Carro".
public class Carro {
    private String nome;

    // FINAL EM TIPO PRIMITIVO:
    // Torna a variável uma constante. O valor de VELOCIDADE_LIMITE (250) não pode ser
    // alterado em nenhum outro lugar do código após ser inicializado.
    // O 'static' indica que o valor pertence à classe, não à instância.
    // Convenção: constantes são escritas em UPPER_SNAKE_CASE.
    public static final double VELOCIDADE_LIMITE = 250;

    // FINAL EM TIPO REFERÊNCIA (Objetos):
    // A referência de memória não pode ser alterada. Você nunca poderá reatribuir
    // um novo objeto a esta variável (ex: this.COMPRADOR = new Comprador(); é proibido).
    // IMPORTANTE: O estado interno do objeto (seus atributos) PODE ser modificado normalmente.
    public final Comprador COMPRADOR = new Comprador();

    // FINAL EM MÉTODOS:
    // Impede que este metodo seja sobrescrito (overridden) por classes filhas.
    // As subclasses (como Porsche) herdam o metodo, mas não podem alterar seu comportamento.
    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
