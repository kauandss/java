package exercicios;

/* Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
    Considerando 1 como domingo.
 */
public class EstruturasCondicionaisSwitch {
    static void main() {
        byte dia = 1;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Digite um valor de 1 a 7.");
                break;
        }
    }
}
