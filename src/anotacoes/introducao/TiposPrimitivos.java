package anotacoes.introducao;

public class TiposPrimitivos {
    /**
     * O método main é a "porta de entrada" do programa.
     * É por aqui que o Java começa a ler e executar as coisas.
     * OBS: No Java moderno (21+), não preciso mais daquele
     * 'public static void main(String[] args)' gigante!
     */
    static void main() {
        // int, double, float , char, byte, short, long, boolean.

        int idade = 19;
        long numeroGrande = 10000;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 19;
        short idadeShort = 19;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'K';

        System.out.println(idade);
        System.out.println("A idade é " + idade + " anos."); // foi feito uma Concatenação aqui.
        System.out.println(verdadeiro);
        System.out.println("char: "+caractere);

        /*
          Casting é um processo de conversão de tipos.
           - Pode atribuir ou tratar um valor de um tipo de variável como outro tipo.
         */
        int idadeCasting = (int) 10000000000L;
        System.out.println(idadeCasting);

        String nome = "Kauan"; // String não é um tipo primitivo, mas sim uma classe.
        System.out.println("Oi meu nome é "+nome);








    }
}
