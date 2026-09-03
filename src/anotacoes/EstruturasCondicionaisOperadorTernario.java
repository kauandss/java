package anotacoes;

public class EstruturasCondicionaisOperadorTernario {
    static void main() {
        // Doar se sálario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro Kauan";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado;

        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        /*
            Utilizando operador ternário para esses casos simples!
            = (condicao) ? verdadeiro : falso
         */
        String resultado01 = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado01);

    }
}
