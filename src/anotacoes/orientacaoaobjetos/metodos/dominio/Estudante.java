package anotacoes.orientacaoaobjetos.metodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){

        System.out.println("=============================");
        // 'this' acessa o atributo da instância específica que invocou o mét0do:
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
