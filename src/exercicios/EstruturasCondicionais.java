package exercicios;

public class EstruturasCondicionais {
    static void main() {
        /*
            Descobrir quanto pagar de imposto de acordo com a tabela de Taxa de Imposto por salário anual da Holanda.
            €0 --> €34,712  tax = 9.78%
            €34,712 --> 68,587  tax = 37.35%
            €68,500 tax = 49.50%
         */
        double salarioAnual = 70000;
        double taxaImposto;

        if(salarioAnual < 34712){
            taxaImposto = 0.097;
        }else if(salarioAnual >= 34712 && salarioAnual < 68587){
            taxaImposto = 0.3735;
        }else{
            taxaImposto = 0.4950;
        }

        double valorImposto = salarioAnual * taxaImposto;
        System.out.println("O valor do imposto a ser pago é: €"+ valorImposto);

    }
}
