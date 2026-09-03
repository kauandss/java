package anotacoes;

public class EstruturasDeRepeticao {
    static void main() {
        // while
        int count = 0;
        while (count < 10) { // enquanto o count for menor que 10, faça...
            System.out.println(count);
            count++;
        }

        // do
        do {
            System.out.println("Dentro do do-while.");

        } while (count < 10);

        // for (variável incrementada; até quando executar; como essa variável vai alterar o status)
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break; // sair do laço quando o if chegar em uma determinada condição verdadeira.
            }
            System.out.println(i);
        }


    }
}
