package anotacoes;

public class EstruturasCondicionaisIF {
    static void main() {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcoólica.");
        }
        // ! (Operador de negação)
        if(!isAutorizadoComprarBebida){ // == if(isAutorizadoComprarBebida == false)
            System.out.println("Não autorizado a comprar bebida alcoólica.");
        }
        System.out.println("Fora do IF");
    }
}
