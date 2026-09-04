package exercicios.introducao;

// Imprima todos os números pares de 0 até 1000
public class EstruturaDeRepeticaoFor {
    static void main() {
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
