package anotacoes.javacore.Hheranca.dominio;

// 'Extends Pessoa' significa que Funcionario herda tudo que é public ou protected de Pessoa.
// É uma relação "É UM" (Funcionario é uma Pessoa).
public class Funcionario extends Pessoa {
    private double salario; // Atributo específico da classe filha. Ela tem os dela e os que herdou do pai.

    static{ // A ordem de execução dos blocos estáticos na herança é: primeiro o do Pai, depois o do Filho.
        System.out.println("Dentro do bloco de inicialização estático de funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 2");
    }

    public Funcionario(String nome){
        // A chamada 'super()' deve ser SEMPRE a primeira linha do construtor da subclasse.
        // Como a classe Pessoa não tem construtor vazio, somos obrigados a passar o 'nome' aqui.
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    @Override // Sobrescrita de mét0do (Override). Estamos alterando o comportamento do mét0do herdado.
    public void imprime() {
        // 'super.imprime()' reaproveita a lógica do metodo original da classe mãe,
        // evitando duplicação de código para imprimir nome, cpf e endereço.
        super.imprime();
        System.out.println(this.salario); // Adicionamos apenas a impressão específica desta classe (salario).
    }

    // Metodo exclusivo da classe filha. Objetos do tipo 'Pessoa' não terão acesso a ele.
    public void relatorioPagamento() {
        // Como 'nome' é protected na classe mãe, podemos acessá-lo usando 'this.nome'.
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
