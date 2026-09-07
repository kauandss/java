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
    public String nome;
    public int idade;
    public double[] salarios;

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

        double media = 0;

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial: " + media);
    }
}
