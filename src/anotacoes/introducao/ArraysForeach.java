package anotacoes.introducao;

public class ArraysForeach {
    static void main() {
        // Formas de inicializar um Array:
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

        /*
         Quando a posição do elemento importa ou quando você quer
         alterar o valor de uma posição específica do array, utilize for()
         */
        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        System.out.println("\n---------- Foreach ----------\n");

        /*
            Quando você só quer ler todos os itens do primeiro ao último e
            não se importa com a posição numérica deles, utilize foreach.
         */
        for(int num:numeros3){
            System.out.println(num);
        }
    }
}
