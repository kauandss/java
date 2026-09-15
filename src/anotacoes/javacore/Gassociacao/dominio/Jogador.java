package anotacoes.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;

    // ASSOCIAÇÃO: O Jogador "tem um" Time.
    // Como a classe Time não tem o Jogador, a relação é Unidirecional (só vem pra cá).
    private Time time;

    public void imprime(){
        System.out.println(this.nome);

        /*
            Regra de segurança: Um jogador pode estar "sem clube" (time == null).
            Se tentarmos imprimir o nome de um time que não existe, o Java dá erro (NullPointerException).
            Por isso, só imprimimos se o time for diferente de null.
         */
        if(time != null){
            System.out.println(time.getNome());
        }
    }
    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) { // Mét0do usado para "contratar" o jogador, ou seja, vincular o time a ele.
        this.time = time;
    }
}
