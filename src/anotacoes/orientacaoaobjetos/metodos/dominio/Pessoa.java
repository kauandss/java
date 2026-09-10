package anotacoes.orientacaoaobjetos.metodos.dominio;

public class Pessoa {

    // Atributos privados: acessíveis apenas dentro desta classe (Encapsulamento).
    // Evita alterações diretas e estados inválidos vindos de classes externas.
    private String nome;
    private int idade;

    // Mét0do que executa uma ação de exibição dos dados internos do objeto
    public void imprime() {
        System.out.println(this.nome); // 'this' referencia explicitamente os atributos da instância atual.
        System.out.println(this.idade);
    }

    // Setter para 'nome': permite atribuir valor com controle
    public void setNome(String nome) {
        this.nome = nome; // 'this.nome' refere-se ao atributo; 'nome' é o parâmetro recebido
    }

    // Setter para 'idade': aplica validação antes de alterar o atributo
    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida.");
            return;
        }
        this.idade = idade;
    }

    // Getter para 'nome': fornece acesso de leitura seguro ao atributo privado
    public String getNome() {
        return this.nome;
    }

    // Getter para 'idade': retorna o valor inteiro armazenado
    public int getIdade() {
        return this.idade;
    }
}
