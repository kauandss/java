package anotacoes.introducao;

public class Operadores {
    static void main() {
        // +, -, / (divisão inteira) e *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;

        System.out.println(resultado);
        System.out.println(numero01+numero02+"Valor: "+numero01+numero02);

        System.out.println("\n--------------------Resto-------------------\n");

        // % - resto da divisão
        int resto = 20 % 2;
        System.out.println(resto); // = 0

        System.out.println("\n-------------------Operadores Relacionais--------------------\n");

        // <, >, <=, >= e !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("Dez é maior que vinte? "+isDezMaiorQueVinte); // false
        System.out.println("Dez é menor que vinte? "+isDezMenorQueVinte); // true
        System.out.println("Dez é igual a vinte? "+isDezIgualVinte); // false
        System.out.println("Dez é diferente de 10? "+isDezDiferenteDez); // false

        System.out.println("\n------------------Operadores Lógicos---------------------\n");

        // && (AND), || (OR) e ! (NOT)

        // && (AND) todas as condições tem que ser verdadeiras para retornar = true.
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+ isDentroDaLeiMaiorQueTrinta); // false
        System.out.println("isDentroDaLeiMenorQueTrinta "+ isDentroDaLeiMenorQueTrinta); // true

        // || (OR) basta uma das condições ser verdadeira para que retorne = true.
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel); // true

        System.out.println("\n-------------------Operadores de Atribuição--------------------\n");

        // =, +=, -=, *=, /= e %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        // ++, --
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++; // 2
        contador--; // 1
        ++contador; // 2
        --contador; // 1

        System.out.println(contador);
        int contador2 = 0;
        System.out.println(contador2++); // 0
        System.out.println(contador2); // 1



    }
}
