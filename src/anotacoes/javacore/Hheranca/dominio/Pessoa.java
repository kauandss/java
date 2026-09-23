package anotacoes.javacore.Hheranca.dominio;

public class Pessoa {
    // O modificador 'protected' é fundamental na herança.
    // Ele permite que as subclasses (como Funcionario) e outras classes do mesmo pacote acessem esses atributos diretamente,
    // mas os mantém ocultos de classes em pacotes diferentes.
    protected String nome;
    protected String cpf;
    protected Endereco endereco; // Relação de Associação (Pessoa tem um Endereco)

    static{ // Bloco de inicialização estático: executado apenas UMA vez quando a JVM carrega a classe em memória.
        System.out.println("Dentro do bloco de inicialização estático de pessoa,");
    }

    // Blocos de inicialização de instância: executados toda vez que um novo objeto é instanciado,
    // sempre ANTES do construtor.
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 2");
    }

    // Como declaramos um construtor com parâmetros, o Java não cria mais o construtor vazio por padrão.
    // Isso obriga as classes filhas a chamarem este construtor explicitamente.
    public Pessoa(String nome){
        System.out.println("Dentro do construtor de pessoa.");
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " "+this.endereco.getCep());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
