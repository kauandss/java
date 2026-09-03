package anotacoes;

public class EstruturasCondicionaisELSEIF {
    static void main() {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        // Caso com apenas 2 condições:
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoólica.");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoólica.");
        }

        // Caso com mais de 2 condições:
        String categoria;
        if (idade < 15) {
            categoria = "Categoria Infantil.";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil.";
        } else {
            categoria = "Categoria Adulto.";
        }
        System.out.println(categoria);

        // OBS: variáveis locais precisam ser inicializadas se não o código vai falhar na compilação.
    }
}
