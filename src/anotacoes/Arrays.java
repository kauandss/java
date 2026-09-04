package anotacoes;

/**
 * Um array é uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo
 * em uma sequência contígua na memória, permitindo acesso rápido e direto através de índices.
 * <p>Arrays podem ser considerados objetos na memória.</p>
 *
 */
public class Arrays {
    static void main() {
        int[] idades = new int[3];  // tipo reference = objeto (array inteiro de 3 posições);
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        System.out.println("\n---------- Padrão de Inicialização ----------\n");
        /*
            Para arrays ou quando você inicializa uma variável fora do mét0do, elas tem um padrão de inicialização.
                - byte, short, int, long, float e double = 0;
                - char = '\u0000' = ' ';
                - boolean = false;
                - String = null;
         */

        String[] nome = new String[3];
        boolean[] salario = new boolean[3];
        float[] idade02 = new float[3];
        System.out.println(nome[0]);
        System.out.println(salario[0]);
        System.out.println(idade02[0]);

        System.out.println("\n---------- Iteração nos Arrays ----------\n");

        String[] nomes = new String[3];
        nomes[0] = "Kauan";
        nomes[1] = "Letícia";
        nomes[2] = "Kevin";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }

    }
}
