package exercicios;
/*
 Dado o valor de um carro, descubra em quantas ele pode ser parcelado
 Condicão valorParcela >= 1000
 */

public class EstruturaDeRepeticaoBreak {
    static void main() {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+parcela+"x de R$"+valorParcela);
        }

        System.out.println("\n-------------- Utilizando continue -----------------\n");
        // Curiosidade: utilizando (continue)
        for(int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela "+parcela+"x de R$"+valorParcela);
        }


    }
}
