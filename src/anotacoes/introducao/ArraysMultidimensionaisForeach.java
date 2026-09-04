package anotacoes.introducao;

public class ArraysMultidimensionaisForeach {
    static void main() {
        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 30;

        dias[1][0] = 29;
        dias[1][1] = 30;
        dias[1][2] = 30;

        for (int[] arrBase : dias) { // "Para cada linha (int[] arrBase) que existe dentro da matriz 'dias'..."
            for(int num : arrBase){ // "Para cada número inteiro (int num) que existe dentro do 'arrBase'..."
                System.out.println(num);
            }
        }
    }
}
