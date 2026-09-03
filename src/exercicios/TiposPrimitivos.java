package exercicios;
/*
    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereco>,
    confirmo que recebi o salário de <salario>, na data <data>.
 */
public class TiposPrimitivos {
    static void main() {
        String nome = "Kauan";
        String endereco = "Rua Pedro Álvares Cabral";
        double salario = 2500.0;
        String dataRecebimentoSalario = "09/03/2026";
        String relatorio = "Eu "+nome+" morando no endereço "+endereco+",\nconfirmo que recebi o salário de "+salario+", na data "+dataRecebimentoSalario;

        System.out.println(relatorio);

    }
}
