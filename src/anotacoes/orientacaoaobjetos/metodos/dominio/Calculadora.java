package anotacoes.orientacaoaobjetos.metodos.dominio;

public class Calculadora {

    // 1. Mét0do sem retorno (void) e sem parâmetros
    // Executa uma ação direta com valores fixos definidos internamente.
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    //      2. Mét0do sem retorno (void) e sem parâmetros
    // Assim como o anterior, apenas executa a instrução interna.
    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    /*
            3. Mét0do sem retorno (void) com parâmetros
        Recebe dois inteiros (num1 e num2) que tornam o mét0do dinâmico,
        mas apenas imprime o resultado no console sem devolvê-lo para quem chamou.
    */
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    /*
            4. Mét0do com retorno (double) e com parâmetros
        Exige a palavra-chave 'return' acompanhada de um valor do tipo double.
        O valor resultante volta para o ponto onde o mét0do foi chamado.
     */
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    /*
            5. Mét0do sem retorno (void) usando 'return' como controle de fluxo
         Em métodos void, o 'return;' vazio serve como um ponto de parada (break):
     */
    public void imprimideDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) { // se num2 for zero, ele imprime o aviso e encerra a execução antes de dividir.
            System.out.println("Não existe divisão por zero.");
            return;
        }
        System.out.println(num1 / num2);

    }
}
