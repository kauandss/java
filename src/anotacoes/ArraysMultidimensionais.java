package anotacoes;

public class ArraysMultidimensionais {

    static void main() {

        // Os dois pares de colchetes [][] indicam que é uma matriz (array de arrays).

        int[][] dias = new int[3][3]; // Crie uma matriz de números inteiros com 3 "linhas" e 3 "colunas".

        System.out.println("\n---------- Referência vs. Valor ----------\n");

        System.out.println(dias[0]); // estou pedindo para ver a "linha 0" inteira. O Java imprime o "end. de memória" dela.

        System.out.println(dias[0][0]); // estou acessando a "linha 0" e a "coluna 0".

        System.out.println("\n---------- Guardando Valores ----------\n");

        dias[0][0] = 31; // Linha 0, Coluna 0 recebe 31
        dias[0][1] = 28; // Linha 0, Coluna 1 recebe 28
        dias[0][2] = 30; // Linha 0, Coluna 2 recebe 30

        // Preenchendo a segunda "linha" (índice 1)
        dias[1][0] = 31; // Linha 1, Coluna 0 recebe 31
        dias[1][1] = 28; // Linha 1, Coluna 1 recebe 28
        dias[1][2] = 30; // Linha 1, Coluna 2 recebe 30

        System.out.println("\n---------- Lendo os Valores ----------\n");

        for (int i = 0; i < dias.length; i++) { // O FOR DE FORA (i) controla as LINHAS.

            // O FOR DE DENTRO (j) controla as COLUNAS daquela linha específica.
            for (int j = 0; j < dias[i].length; j++) {

                // Imprime o valor que está no cruzamento da linha 'i' com a coluna 'j'
                System.out.println(dias[i][j]);
            }
        }
    }
}
