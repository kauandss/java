package anotacoes.introducao;

public class ArraysMultidimensionaisInicializacao {
    static void main() {
        int[] array = {6, 1, 2007};
        int[][] arrayInt = new int[3][];
        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {6, 1, 2007}}; // mesma coisa do de cima

        arrayInt[0] = new int[2]; // array da posição 0 está fazendo referência para um array de 2 pos.
        arrayInt[1] = new int[]{1, 2, 3}; // array da posição 1 está fazendo referência para um array de 3 pos.
        arrayInt[2] = array; // array da posição 2 está fazendo referência para um array de 6 pos.



        for (int[] arrayBase : arrayInt) {
            System.out.println("\n------\n");
            for (int num : arrayBase) {
                System.out.println(num + " ");
            }
        }
    }
}
