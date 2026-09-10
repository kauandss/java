package exercicios.orientacaoaobjetos.metodos01.dominio;

/**
 * Crie uma classe <b>Funcionário</b> com os seguintes atributos:
 *
 * <p>- nome</p>
 * <p>- idade</p>
 * <p>- salário // três salários devem ser guardados</p>
 *
 * <p>Crie dois métodos: </p>
 * <p>1. Para imprimir os dados;</p>
 * <p>2. Para tirar a média dos salários e imprimir o resultado.</p>
 */
public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime() {

        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial: " + media);
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
